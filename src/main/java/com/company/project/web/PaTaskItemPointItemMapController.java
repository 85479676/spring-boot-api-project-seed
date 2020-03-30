package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaTaskItemPointItemMap;
import com.company.project.service.PaTaskItemPointItemMapService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/12.
*/
@RestController
@RequestMapping("/pa/task/item/point/item/map")
public class PaTaskItemPointItemMapController extends DomainedResource{
     @Resource
     private PaTaskItemPointItemMapService paTaskItemPointItemMapService;

     @PostMapping("/add")
     public Result add(PaTaskItemPointItemMap paTaskItemPointItemMap) {
        paTaskItemPointItemMapService.save(paTaskItemPointItemMap);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        PaTaskItemPointItemMap paTaskItemPointItemMap = paTaskItemPointItemMapService.findById(unid);
//        paTaskItemPointItemMap.setFlagDel(true);
        paTaskItemPointItemMapService.update(paTaskItemPointItemMap);
        return ResultGenerator.genSuccessResult(paTaskItemPointItemMap);
     }

     @PutMapping("/update")
     public Result update(PaTaskItemPointItemMap paTaskItemPointItemMap) {
        paTaskItemPointItemMapService.update(paTaskItemPointItemMap);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        PaTaskItemPointItemMap paTaskItemPointItemMap = paTaskItemPointItemMapService.findById(unid);
        return ResultGenerator.genSuccessResult(paTaskItemPointItemMap);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
         PageHelper.startPage(page, size);
         List<PaTaskItemPointItemMap> list = null;
         Condition condition = new Condition(PaTaskItemPointItemMap.class);
         Example.Criteria cr= condition.createCriteria();
         list = paTaskItemPointItemMapService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
