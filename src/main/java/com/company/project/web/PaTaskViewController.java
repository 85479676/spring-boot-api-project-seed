package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaTaskView;
import com.company.project.service.PaTaskViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/10.
*/
@RestController
@RequestMapping("/pa/task/view")
public class PaTaskViewController extends DomainedResource{
     @Resource
     private PaTaskViewService paTaskViewService;

     @PostMapping("/add")
     public Result add(PaTaskView paTaskView) {
        paTaskViewService.save(paTaskView);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        PaTaskView paTaskView = paTaskViewService.findById(unid);
        paTaskView.setFlagDel(true);
        paTaskViewService.update(paTaskView);
        return ResultGenerator.genSuccessResult(paTaskView);
     }

     @PutMapping("/update")
     public Result update(PaTaskView paTaskView) {
        paTaskViewService.update(paTaskView);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        PaTaskView paTaskView = paTaskViewService.findById(unid);
        return ResultGenerator.genSuccessResult(paTaskView);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
         PageHelper.startPage(page, size);
         List<PaTaskView> list = null;
         Condition condition = new Condition(PaTaskView.class);
         Example.Criteria cr= condition.createCriteria();
         list = paTaskViewService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
