package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPersonView;
import com.company.project.service.PaPatrolPersonViewService;
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
@RequestMapping("/pa/patrol/person/view")
public class PaPatrolPersonViewController extends DomainedResource{
     @Resource
     private PaPatrolPersonViewService paPatrolPersonViewService;

     @PostMapping("/add")
     public Result add(PaPatrolPersonView paPatrolPersonView) {
        paPatrolPersonViewService.save(paPatrolPersonView);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        PaPatrolPersonView paPatrolPersonView = paPatrolPersonViewService.findById(unid);
        paPatrolPersonView.setFlagDel(true);
        paPatrolPersonViewService.update(paPatrolPersonView);
        return ResultGenerator.genSuccessResult(paPatrolPersonView);
     }

     @PutMapping("/update")
     public Result update(PaPatrolPersonView paPatrolPersonView) {
        paPatrolPersonViewService.update(paPatrolPersonView);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        PaPatrolPersonView paPatrolPersonView = paPatrolPersonViewService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPersonView);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request,domainUnid);
         PageHelper.startPage(page, size);
         List<PaPatrolPersonView> list = null;
         Condition condition = new Condition(PaPatrolPersonView.class);
         Example.Criteria cr= condition.createCriteria();
         list = paPatrolPersonViewService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
