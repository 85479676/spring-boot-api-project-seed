package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogRaw202002;
import com.company.project.service.LogRaw202002Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/23.
*/
@RestController
@RequestMapping("/log/raw202002")
public class LogRaw202002Controller extends DomainedResource{
     @Resource
     private LogRaw202002Service logRaw202002Service;

     @PostMapping("/add")
     public Result add(LogRaw202002 logRaw202002) {
        logRaw202002Service.save(logRaw202002);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        LogRaw202002 logRaw202002 = logRaw202002Service.findById(unid);
//        logRaw202002.setFlagDel(true);
        logRaw202002Service.update(logRaw202002);
        return ResultGenerator.genSuccessResult(logRaw202002);
     }

     @PutMapping("/update")
     public Result update(LogRaw202002 logRaw202002) {
        logRaw202002Service.update(logRaw202002);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        LogRaw202002 logRaw202002 = logRaw202002Service.findById(unid);
        return ResultGenerator.genSuccessResult(logRaw202002);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam
        (defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request,domainUnid);
         PageHelper.startPage(page, size);
         List<LogRaw202002> list = null;
         Condition condition = new Condition(LogRaw202002.class);
         Example.Criteria cr= condition.createCriteria();
         list = logRaw202002Service.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
