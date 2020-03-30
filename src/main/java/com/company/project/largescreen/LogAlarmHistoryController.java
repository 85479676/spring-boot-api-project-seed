package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogAlarmHistory;
import com.company.project.service.LogAlarmHistoryService;
import com.company.project.util.DateHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/27.
 */
@RestController
@RequestMapping("/logAlarmHistory")
public class LogAlarmHistoryController extends DomainedResource {
    @Resource
    private LogAlarmHistoryService logAlarmHistoryService;

    @PostMapping("/add")
    public Result add(LogAlarmHistory logAlarmHistory) {
        logAlarmHistoryService.save(logAlarmHistory);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LogAlarmHistory logAlarmHistory = logAlarmHistoryService.findById(unid);
//        logAlarmHistory.setFlagDel(true);
        logAlarmHistoryService.update(logAlarmHistory);
        return ResultGenerator.genSuccessResult(logAlarmHistory);
    }

    @PutMapping("/update")
    public Result update(LogAlarmHistory logAlarmHistory) {
        logAlarmHistoryService.update(logAlarmHistory);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogAlarmHistory logAlarmHistory = logAlarmHistoryService.findById(unid);
        return ResultGenerator.genSuccessResult(logAlarmHistory);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "50") Integer size, @RequestParam(required = false) String unid, @RequestParam(required = false) String datimeFrom,
                       @RequestParam(required = false) String datimeTo) {
        String temp = this.tokenValue(request, domainUnid);
        if (datimeFrom == null) {
            datimeFrom = DateHelper.getDateYYYY_MM_DD_MIN();
        }
        if (datimeTo == null) {
            datimeTo = DateHelper.getDateYYYY_MM_DD_MAX();
        }
        PageHelper.startPage(page, size);
        List<LogAlarmHistory> list = logAlarmHistoryService.selectCountOne(unid, datimeFrom, datimeTo);
        for (LogAlarmHistory histor : list
        ) {
            histor.setAmount(histor.getUnid());

            histor.setKey(histor.getStart());

        }
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
