package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogEventView;
import com.company.project.service.LogEventViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/20.
 * 报警历史视图查询
 */
@RestController
@RequestMapping("/eventview")
public class LogEventViewController extends DomainedResource {
    @Resource
    private LogEventViewService logEventViewService;

    @PostMapping("/add")
    public Result add(LogEventView logEventView) {
        logEventViewService.save(logEventView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        logEventViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LogEventView logEventView) {
        logEventViewService.update(logEventView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogEventView logEventView = logEventViewService.findById(unid);
        return ResultGenerator.genSuccessResult(logEventView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size, @RequestParam(required = false) String unidEntity) {
        String temp = this.tokenValue(request,domainUnid);
        PageHelper.startPage(page, size);
        List<LogEventView> list = null;
        Condition condition = new Condition(LogEventView.class);
        Example.Criteria cr = condition.createCriteria();
//        if (unidEntity != null) {
//            condition.createCriteria().andCondition("UNID_ENTITY=+unidEntity").andCondition("FLAG_DEL=0");
//        }
        if (unidEntity != null) {
            cr.andCondition("UNID_ENTITY ='" + unidEntity + "'");
        }
        cr.andCondition(temp);
        cr.andCondition("FLAG_DEL=0");
        list = logEventViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
