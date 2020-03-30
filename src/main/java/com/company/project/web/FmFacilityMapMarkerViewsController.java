package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmFacilityMapMarkerViews;
import com.company.project.service.FmFacilityMapMarkerViewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 根据点位获取图未打点位
 * Created by CodeGenerator on 2020/03/12.
 */
@RestController
@RequestMapping("/fmfacilityviews")
public class FmFacilityMapMarkerViewsController extends DomainedResource {
    @Resource
    private FmFacilityMapMarkerViewsService fmFacilityMapMarkerViewsService;

    @PostMapping("/add")
    public Result add(FmFacilityMapMarkerViews fmFacilityMapMarkerViews) {
        fmFacilityMapMarkerViewsService.save(fmFacilityMapMarkerViews);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        FmFacilityMapMarkerViews fmFacilityMapMarkerViews = fmFacilityMapMarkerViewsService.findById(unid);
        fmFacilityMapMarkerViews.setFlagDel(true);
        fmFacilityMapMarkerViewsService.update(fmFacilityMapMarkerViews);
        return ResultGenerator.genSuccessResult(fmFacilityMapMarkerViews);
    }

    @PutMapping("/update")
    public Result update(FmFacilityMapMarkerViews fmFacilityMapMarkerViews) {
        fmFacilityMapMarkerViewsService.update(fmFacilityMapMarkerViews);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmFacilityMapMarkerViews fmFacilityMapMarkerViews = fmFacilityMapMarkerViewsService.findById(unid);
        return ResultGenerator.genSuccessResult(fmFacilityMapMarkerViews);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmFacilityMapMarkerViews> list = null;
        Condition condition = new Condition(FmFacilityMapMarkerViews.class);
        Example.Criteria cr = condition.createCriteria();
        list = fmFacilityMapMarkerViewsService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }

    @GetMapping("/list/{unid}")
    public Result listGetll(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                            @RequestParam(required = false) String domainUnid, @PathVariable String unid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmFacilityMapMarkerViews> list = fmFacilityMapMarkerViewsService.getAllFacility(unid);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }


}
