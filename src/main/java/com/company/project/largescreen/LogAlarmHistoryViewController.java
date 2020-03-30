package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogAlarmHistoryView;
import com.company.project.model.LogAlarmHistoryViews;
import com.company.project.service.LogAlarmCurrentViewService;
import com.company.project.service.LogAlarmHistoryViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 实际为LOG_ALARM_CURRENT表
 * Created by CodeGenerator on 2020/03/13.
 */
@RestController
@RequestMapping("/alarmHistory")
public class LogAlarmHistoryViewController extends DomainedResource {
    @Resource
    private LogAlarmHistoryViewService logAlarmHistoryViewService;

    @Resource
    private LogAlarmCurrentViewService logAlarmCurrentViewService;

    @GetMapping("/alarm/list")
    public Result alarmList(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page,
                            @RequestParam(defaultValue = "20") Integer size, @RequestParam(required = false) String name, @RequestParam(required = false) String datimeFrom,
                            @RequestParam(required = false) String datimeTo, @RequestParam(required = false) String unid, @RequestParam(required = false) String alarmStatus) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<LogAlarmHistoryView> list = null;
        Condition condition = new Condition(LogAlarmHistoryView.class);
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
        list = logAlarmHistoryViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);

        List<LogAlarmHistoryViews> list = logAlarmCurrentViewService.getCountAlarm(domainUnid);
        for (LogAlarmHistoryViews views : list) {
            if (views.getAlias() == null) {
                views.setAlias("NORMAL");
            }
            if (views.getAlarminfo() == null) {
                views.setAlarminfo("正常");
            }
        }
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
