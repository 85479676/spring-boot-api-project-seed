package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPointView;
import com.company.project.service.PaPatrolPointViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/06.
*/
@RestController
@RequestMapping("/pa/patrol/point/view")
public class PaPatrolPointViewController extends DomainedResource{
     @Resource
     private PaPatrolPointViewService paPatrolPointViewService;

     @PostMapping("/add")
     public Result add(PaPatrolPointView paPatrolPointView) {
        paPatrolPointViewService.save(paPatrolPointView);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        PaPatrolPointView paPatrolPointView = paPatrolPointViewService.findById(unid);
        paPatrolPointView.setFlagDel(true);
        paPatrolPointViewService.update(paPatrolPointView);
        return ResultGenerator.genSuccessResult(paPatrolPointView);
     }

     @PutMapping("/update")
     public Result update(PaPatrolPointView paPatrolPointView) {
        paPatrolPointViewService.update(paPatrolPointView);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        PaPatrolPointView paPatrolPointView = paPatrolPointViewService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPointView);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
         PageHelper.startPage(page, size);
         List<PaPatrolPointView> list = null;
         Condition condition = new Condition(PaPatrolPointView.class);
         Example.Criteria cr= condition.createCriteria();
         list = paPatrolPointViewService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
