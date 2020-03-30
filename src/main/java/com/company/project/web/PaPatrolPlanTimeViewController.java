package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPlanTimeView;
import com.company.project.service.PaPatrolPlanTimeViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/07.
*/
@RestController
@RequestMapping("/pa/patrol/plan/time/view")
public class PaPatrolPlanTimeViewController extends DomainedResource{
     @Resource
     private PaPatrolPlanTimeViewService paPatrolPlanTimeViewService;

     @PostMapping("/add")
     public Result add(PaPatrolPlanTimeView paPatrolPlanTimeView) {
        paPatrolPlanTimeViewService.save(paPatrolPlanTimeView);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        PaPatrolPlanTimeView paPatrolPlanTimeView = paPatrolPlanTimeViewService.findById(unid);
        paPatrolPlanTimeView.setFlagDel(true);
        paPatrolPlanTimeViewService.update(paPatrolPlanTimeView);
        return ResultGenerator.genSuccessResult(paPatrolPlanTimeView);
     }

     @PutMapping("/update")
     public Result update(PaPatrolPlanTimeView paPatrolPlanTimeView) {
        paPatrolPlanTimeViewService.update(paPatrolPlanTimeView);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        PaPatrolPlanTimeView paPatrolPlanTimeView = paPatrolPlanTimeViewService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPlanTimeView);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
         PageHelper.startPage(page, size);
         List<PaPatrolPlanTimeView> list = null;
         Condition condition = new Condition(PaPatrolPlanTimeView.class);
         Example.Criteria cr= condition.createCriteria();
         list = paPatrolPlanTimeViewService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
