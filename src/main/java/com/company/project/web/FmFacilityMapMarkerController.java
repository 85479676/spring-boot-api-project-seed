package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmFacilityMapMarker;
import com.company.project.service.FmFacilityMapMarkerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/11.
*/
@RestController
@RequestMapping("/fm/facility/map/marker")
public class FmFacilityMapMarkerController extends DomainedResource{
     @Resource
     private FmFacilityMapMarkerService fmFacilityMapMarkerService;

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
        FmFacilityMapMarker fmFacilityMapMarker = fmFacilityMapMarkerService.findById(unid);
        return ResultGenerator.genSuccessResult(fmFacilityMapMarker);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request,domainUnid);
         PageHelper.startPage(page, size);
         List<FmFacilityMapMarker> list = null;
         Condition condition = new Condition(FmFacilityMapMarker.class);
         Example.Criteria cr= condition.createCriteria();
         list = fmFacilityMapMarkerService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
