package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogRaw202002View;
import com.company.project.service.LogRaw202002ViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/26.
 */
@RestController
@RequestMapping("/lograwview")
public class LogRaw202002ViewController extends DomainedResource {
    @Resource
    private LogRaw202002ViewService logRaw202002ViewService;

    @PostMapping("/add")
    public Result add(LogRaw202002View logRaw202002View) {
        logRaw202002ViewService.save(logRaw202002View);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        logRaw202002ViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LogRaw202002View logRaw202002View) {
        logRaw202002ViewService.update(logRaw202002View);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogRaw202002View logRaw202002View = logRaw202002ViewService.findById(unid);
        return ResultGenerator.genSuccessResult(logRaw202002View);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String name) {
        String temp = this.tokenValue(request,domainUnid);
        PageHelper.startPage(page, size);
        List<LogRaw202002View> list = null;
        Condition condition = new Condition(LogRaw202002View.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("FACILITY_NAME like'%" + name + "%'");
        }
        cr.andCondition("FLAG_DEL=0");
        cr.andCondition(temp);
        list = logRaw202002ViewService.findByCondition(condition);

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
