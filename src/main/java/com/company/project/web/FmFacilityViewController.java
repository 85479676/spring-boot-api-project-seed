package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmFacilityView;
import com.company.project.service.FmFacilityViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 设备接口
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/facilityview")
public class FmFacilityViewController extends DomainedResource {
    @Resource
    private FmFacilityViewService fmFacilityViewService;

    @PostMapping("/add")
    public Result add(FmFacilityView fmFacilityView) {
        fmFacilityViewService.save(fmFacilityView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        fmFacilityViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(FmFacilityView fmFacilityView) {
        fmFacilityViewService.update(fmFacilityView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmFacilityView fmFacilityView = fmFacilityViewService.findById(unid);
        return ResultGenerator.genSuccessResult(fmFacilityView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size,
                       @RequestParam(required = false) String name, @RequestParam(required = false) String idSystem ,@RequestParam(required = false) String idType
            , HttpServletRequest request, @RequestParam(required = false) String domainUnid
            , @RequestParam(required = false) String alias, @RequestParam(required = false) String unid
    ) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmFacilityView> list = null;
        Condition condition = new Condition(FmFacilityView.class);
        Example.Criteria cr = condition.createCriteria();
        if (unid != null && unid != "") {
            cr.andCondition("UNID='" + unid + "'");
        }
        if (name != null && name != "") {
            cr.andCondition("NAME like'%" + name + "%'");
        }
        if (idSystem != null && idSystem != "") {
            cr.andCondition("find_in_set(ID_SYSTEM,'" + idSystem + "')");
        }
        if (idType != null && idType != "") {
            cr.andCondition("find_in_set(ID_TYPE,'" + idType + "')");
        }

        if (alias != null && alias != "") {
            cr.andCondition("ALIAS='" + alias + "'");
        }
        cr.andCondition(temp).andCondition("FLAG_DEL=0").andCondition("STATUS=1");
        list = fmFacilityViewService.findByCondition(condition);

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("property/list")
    public Result listProperty(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size,
                               @RequestParam(required = false) String name, @RequestParam(required = false) String idType
            , HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(required = false) String idSystem
            , @RequestParam(required = false) String alias
    ) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmFacilityView> list = null;
        Condition condition = new Condition(FmFacilityView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null && name != "") {
            cr.andCondition("NAME like'%" + name + "%'");
        }
        if (idType != null && idType != "") {
            cr.andCondition("find_in_set(ID_TYPE,'" + idType + "')");
        }
        if (idSystem != null && idSystem != "") {
            cr.andCondition("find_in_set(ID_SYSTEM,'" + idSystem + "')");
        }

        if (alias != null && alias != "") {
            cr.andCondition("ALIAS='" + alias + "'");
        }
        cr.andCondition(temp).andCondition("FLAG_DEL=0");
        list = fmFacilityViewService.findByCondition(condition);

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

}
