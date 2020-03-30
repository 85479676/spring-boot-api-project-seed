package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogAlarmCurrentView;
import com.company.project.service.LogAlarmCurrentViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/25.
 */
@RestController
@RequestMapping("/alarmCurrent")
public class LogAlarmCurrentViewController extends DomainedResource {
    @Resource
    private LogAlarmCurrentViewService logAlarmCurrentViewService;

    @PostMapping("/add")
    public Result add(LogAlarmCurrentView logAlarmCurrentView) {
        logAlarmCurrentViewService.save(logAlarmCurrentView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LogAlarmCurrentView logAlarmCurrentView = logAlarmCurrentViewService.findById(unid);
        logAlarmCurrentView.setFlagDel(true);
        logAlarmCurrentViewService.update(logAlarmCurrentView);
        return ResultGenerator.genSuccessResult(logAlarmCurrentView);
    }

    @PutMapping("/update")
    public Result update(LogAlarmCurrentView logAlarmCurrentView) {
        logAlarmCurrentViewService.update(logAlarmCurrentView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogAlarmCurrentView logAlarmCurrentView = logAlarmCurrentViewService.findById(unid);
        return ResultGenerator.genSuccessResult(logAlarmCurrentView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size, @RequestParam(required = false) String name, @RequestParam(required = false) String datimeFrom,
                       @RequestParam(required = false) String datimeTo, @RequestParam(required = false) String unid, @RequestParam(required = false) String alarmStatus) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<LogAlarmCurrentView> list = null;
        Condition condition = new Condition(LogAlarmCurrentView.class);
        Example.Criteria cr = condition.createCriteria();
        if (unid != null && unid != "") {
            cr.andCondition("UNID='" + unid + "'");
        }
        if (name != null && name != "") {
            cr.andCondition("NAME LIKE'%" + name + "%'");
        }
        if (datimeFrom != null && datimeFrom != "" && datimeTo != null && datimeTo != "") {
            cr.andCondition("SYSTEM_DTIME BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo + "'");
        }
        if (alarmStatus != null && alarmStatus != "") {
            cr.andCondition("ALARM_STATUS='" + alarmStatus + "'");
        }
        cr.andCondition(temp).andCondition("FLAG_DEL=0");
        list = logAlarmCurrentViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


}
