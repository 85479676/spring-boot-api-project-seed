package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AnWaterDayView;
import com.company.project.model.LogSyslog;
import com.company.project.service.LogSyslogService;
import com.company.project.util.DateHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/25.
 * 系统日志
 */
@RestController
@RequestMapping("/syslog")
public class LogSyslogController {
    @Resource
    private LogSyslogService logSyslogService;

    @PostMapping("/add")
    public Result add(LogSyslog logSyslog) {
        logSyslogService.save(logSyslog);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        logSyslogService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LogSyslog logSyslog) {
        logSyslogService.update(logSyslog);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogSyslog logSyslog = logSyslogService.findById(unid);
        return ResultGenerator.genSuccessResult(logSyslog);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String name,
                       @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo) {
        PageHelper.startPage(page, size);

        /**
         * 默认当天日志
         */
        datimeFrom = DateHelper.getDateYYYY_MM_DD_MIN();
        datimeTo = DateHelper.getDateYYYY_MM_DD_MAX();
        List<LogSyslog> list = null;
        Condition condition = new Condition(AnWaterDayView.class);
        if (datimeFrom != null) {
            condition.createCriteria().andCondition("DATIME_SYS BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo).andCondition("'").andCondition("FLAG_DEL=0");
            condition.orderBy("aiid").desc();
        }
        if (name != null) {
            condition.createCriteria().andCondition("NAME like'%" + name + "%'").andCondition("FLAG_DEL=0");
            condition.orderBy("aiid").desc();
        }

        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = logSyslogService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
