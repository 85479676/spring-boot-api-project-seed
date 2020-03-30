package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmFacilityMapMarker;
import com.company.project.model.FmFacilityMapMarkerView;
import com.company.project.service.FmFacilityMapMarkerService;
import com.company.project.service.FmFacilityMapMarkerViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.company.project.util.Empty.isEmpty;

/**
 * Created by CodeGenerator on 2020/03/11.
 */
@RestController
@RequestMapping("/mapmarkerview")
public class FmFacilityMapMarkerViewController extends DomainedResource {
    @Resource
    private FmFacilityMapMarkerViewService fmFacilityMapMarkerViewService;

    @Resource
    private FmFacilityMapMarkerService fmFacilityMapMarkerService;

    /**
     * 设备点位新增
     *
     * @param fmFacilityMapMarker
     * @return
     */
    @PostMapping("/add")
    public Result add(FmFacilityMapMarker fmFacilityMapMarker) {
        fmFacilityMapMarkerService.save(fmFacilityMapMarker);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        FmFacilityMapMarker fmFacilityMapMarker = fmFacilityMapMarkerService.findById(unid);
        fmFacilityMapMarker.setFlagDel(true);
        fmFacilityMapMarkerService.update(fmFacilityMapMarker);
        return ResultGenerator.genSuccessResult(fmFacilityMapMarker);
    }

    @PutMapping("/update")
    public Result update(FmFacilityMapMarker fmFacilityMapMarker) {
        fmFacilityMapMarkerService.update(fmFacilityMapMarker);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmFacilityMapMarkerView fmFacilityMapMarkerView = fmFacilityMapMarkerViewService.findById(unid);
        return ResultGenerator.genSuccessResult(fmFacilityMapMarkerView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String unidMap, @RequestParam(required = false) String idType, @RequestParam(required = false) Double x,
                       @RequestParam(required = false) Double y, @RequestParam(required = false) Double radius, @RequestParam(required = false) String name) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmFacilityMapMarkerView> list = null;
        Condition condition = new Condition(FmFacilityMapMarkerView.class);
        Example.Criteria cr = condition.createCriteria();
        if (unidMap != null && unidMap != "") {
            cr.andCondition("UNID_MAP='" + unidMap + "'");
        }
        if (name != null && name != "") {
            cr.andCondition("NAME='" + name + "'");
        }

        if (idType != null && idType != "") {
            cr.andCondition("find_in_set(ID_TYPE,'" + idType + "')");
        }


        if (!isEmpty(x) && !isEmpty(y) && !isEmpty(radius)) {
            StringBuilder builder = new StringBuilder();
            builder.append(" X  between ").append(x - radius).append(" and ").append(x + radius);
            builder.append(" and Y  between ").append(y - radius).append(" and ").append(y + radius);
            cr.andCondition(builder.toString());
        }
        cr.andCondition(temp).andCondition("FLAG_DEL=0");
        list = fmFacilityMapMarkerViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
