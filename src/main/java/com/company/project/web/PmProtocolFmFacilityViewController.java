package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PmProtocolFmFacilityView;
import com.company.project.service.PmProtocolFmFacilityViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/09.
 */
@RestController
@RequestMapping("/facilityviews")
public class PmProtocolFmFacilityViewController extends DomainedResource {
    @Resource
    private PmProtocolFmFacilityViewService pmProtocolFmFacilityViewService;

    @PostMapping("/add")
    public Result add(PmProtocolFmFacilityView pmProtocolFmFacilityView) {
        pmProtocolFmFacilityViewService.save(pmProtocolFmFacilityView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PmProtocolFmFacilityView pmProtocolFmFacilityView = pmProtocolFmFacilityViewService.findById(unid);
        pmProtocolFmFacilityView.setFlagDel(true);
        pmProtocolFmFacilityViewService.update(pmProtocolFmFacilityView);
        return ResultGenerator.genSuccessResult(pmProtocolFmFacilityView);
    }

    @PutMapping("/update")
    public Result update(PmProtocolFmFacilityView pmProtocolFmFacilityView) {
        pmProtocolFmFacilityViewService.update(pmProtocolFmFacilityView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PmProtocolFmFacilityView pmProtocolFmFacilityView = pmProtocolFmFacilityViewService.findById(unid);
        return ResultGenerator.genSuccessResult(pmProtocolFmFacilityView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = true) String fmUnid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PmProtocolFmFacilityView> list = null;
        Condition condition = new Condition(PmProtocolFmFacilityView.class);
        Example.Criteria cr = condition.createCriteria();
        if (fmUnid != null) {
            cr.andCondition("fm_unid='" + fmUnid + "'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = pmProtocolFmFacilityViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
