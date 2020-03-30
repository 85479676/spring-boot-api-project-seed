package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmFacilityView;
import com.company.project.model.FmFacilityViewVice;
import com.company.project.service.FmFacilityViewViceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/21.
 */
@RestController
@RequestMapping("/facilityviewvice")
public class FmFacilityViewViceController extends DomainedResource {
    @Resource
    private FmFacilityViewViceService fmFacilityViewViceService;

    @PostMapping("/add")
    public Result add(FmFacilityViewVice fmFacilityViewVice) {
        fmFacilityViewViceService.save(fmFacilityViewVice);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        FmFacilityViewVice fmFacilityViewVice = fmFacilityViewViceService.findById(unid);
        fmFacilityViewVice.setFlagDel(true);
        fmFacilityViewViceService.update(fmFacilityViewVice);
        return ResultGenerator.genSuccessResult(fmFacilityViewVice);
    }

    @PutMapping("/update")
    public Result update(FmFacilityViewVice fmFacilityViewVice) {
        fmFacilityViewViceService.update(fmFacilityViewVice);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmFacilityViewVice fmFacilityViewVice = fmFacilityViewViceService.findById(unid);
        return ResultGenerator.genSuccessResult(fmFacilityViewVice);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size,
                       @RequestParam(required = false) String name, @RequestParam(required = false) String idSystem, @RequestParam(required = false) String idType
            , HttpServletRequest request, @RequestParam(required = false) String domainUnid
            , @RequestParam(required = false) String alias, @RequestParam(required = false) String unid
    ) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmFacilityViewVice> list = null;
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
        list = fmFacilityViewViceService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
