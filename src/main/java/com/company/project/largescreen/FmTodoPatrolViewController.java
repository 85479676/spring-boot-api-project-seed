package com.company.project.largescreen;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmTodoPatrolView;
import com.company.project.service.FmTodoPatrolViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import com.company.project.configurer.DomainedResource;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;
import javax.servlet.http.HttpServletRequest;
import javax.annotation.Resource;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
* Created by CodeGenerator on 2020/03/19.
*/
@RestController
@RequestMapping("/fm/todo/patrol/view")
public class FmTodoPatrolViewController extends DomainedResource{
     @Resource
     private FmTodoPatrolViewService fmTodoPatrolViewService;

     @PostMapping("/add")
     public Result add(FmTodoPatrolView fmTodoPatrolView) {
        fmTodoPatrolViewService.save(fmTodoPatrolView);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        FmTodoPatrolView fmTodoPatrolView = fmTodoPatrolViewService.findById(unid);
        fmTodoPatrolView.setFlagDel(true);
        fmTodoPatrolViewService.update(fmTodoPatrolView);
        return ResultGenerator.genSuccessResult(fmTodoPatrolView);
     }

     @PutMapping("/update")
     public Result update(FmTodoPatrolView fmTodoPatrolView) {
        fmTodoPatrolViewService.update(fmTodoPatrolView);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        FmTodoPatrolView fmTodoPatrolView = fmTodoPatrolViewService.findById(unid);
        return ResultGenerator.genSuccessResult(fmTodoPatrolView);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam
        (defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request,domainUnid);
         PageHelper.startPage(page, size);
         List<FmTodoPatrolView> list = null;
         Condition condition = new Condition(FmTodoPatrolView.class);
         Example.Criteria cr= condition.createCriteria();
         list = fmTodoPatrolViewService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
