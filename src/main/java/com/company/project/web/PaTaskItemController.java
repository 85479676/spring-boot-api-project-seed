package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaTaskItem;
import com.company.project.service.PaTaskItemService;
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
@RequestMapping("/pataskitem")
public class PaTaskItemController extends DomainedResource{
     @Resource
     private PaTaskItemService paTaskItemService;

     @PostMapping("/add")
     public Result add(PaTaskItem paTaskItem) {
        paTaskItemService.save(paTaskItem);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        PaTaskItem paTaskItem = paTaskItemService.findById(unid);
        paTaskItem.setFlagDel(true);
        paTaskItemService.update(paTaskItem);
        return ResultGenerator.genSuccessResult(paTaskItem);
     }

     @PutMapping("/update")
     public Result update(PaTaskItem paTaskItem) {
        paTaskItemService.update(paTaskItem);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        PaTaskItem paTaskItem = paTaskItemService.findById(unid);
        return ResultGenerator.genSuccessResult(paTaskItem);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
         PageHelper.startPage(page, size);
         List<PaTaskItem> list = null;
         Condition condition = new Condition(PaTaskItem.class);
         Example.Criteria cr= condition.createCriteria();
         list = paTaskItemService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
