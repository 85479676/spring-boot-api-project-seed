package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogAlarmCurrent;
import com.company.project.service.LogAlarmCurrentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/17.
*/
@RestController
@RequestMapping("/log/alarm/current")
public class LogAlarmCurrentController extends DomainedResource{
     @Resource
     private LogAlarmCurrentService logAlarmCurrentService;

     @PostMapping("/add")
     public Result add(LogAlarmCurrent logAlarmCurrent) {
        logAlarmCurrentService.save(logAlarmCurrent);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        LogAlarmCurrent logAlarmCurrent = logAlarmCurrentService.findById(unid);
//        logAlarmCurrent.setFlagDel(true);
        logAlarmCurrentService.update(logAlarmCurrent);
        return ResultGenerator.genSuccessResult(logAlarmCurrent);
     }

     @PutMapping("/update")
     public Result update(LogAlarmCurrent logAlarmCurrent) {
        logAlarmCurrentService.update(logAlarmCurrent);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        LogAlarmCurrent logAlarmCurrent = logAlarmCurrentService.findById(unid);
        return ResultGenerator.genSuccessResult(logAlarmCurrent);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam
        (defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request,domainUnid);
         PageHelper.startPage(page, size);
         List<LogAlarmCurrent> list = null;
         Condition condition = new Condition(LogAlarmCurrent.class);
         Example.Criteria cr= condition.createCriteria();
         list = logAlarmCurrentService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
