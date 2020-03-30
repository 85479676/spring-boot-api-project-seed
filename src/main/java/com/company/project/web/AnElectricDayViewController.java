package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AnElectricDayView;
import com.company.project.service.AnElectricDayViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/22.
 */
@RestController
@RequestMapping("/electricday")
public class AnElectricDayViewController extends DomainedResource {
    @Resource
    private AnElectricDayViewService anElectricDayViewService;

    @PostMapping("/add")
    public Result add(AnElectricDayView anElectricDayView) {
        anElectricDayViewService.save(anElectricDayView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        anElectricDayViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(AnElectricDayView anElectricDayView) {
        anElectricDayViewService.update(anElectricDayView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        AnElectricDayView anElectricDayView = anElectricDayViewService.findById(unid);
        return ResultGenerator.genSuccessResult(anElectricDayView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size,
                       @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo, String domainUnid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<AnElectricDayView> list = null;
        Condition condition = new Condition(AnElectricDayView.class);
        Example.Criteria cr = condition.createCriteria();
        if (datimeFrom != null) {
            cr.andCondition("SYSTEM_DATIME BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo).andCondition("'");
        }
        cr.andCondition(temp);
        list = anElectricDayViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/alarm/list")
    public Result listAlarm(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size,
                            @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo, @RequestParam(required = false) String domainUnid,
                            @RequestParam(required = false) String alarmCount) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<AnElectricDayView> list = null;
        Condition condition = new Condition(AnElectricDayView.class);
        Example.Criteria cr = condition.createCriteria();
        if (datimeFrom != null && datimeFrom != "" && datimeTo != null && datimeTo != "") {
            cr.andCondition("NAME_DATE >='" + datimeFrom + "'").andCondition("NAME_DATE <='" + datimeTo + "'");
        }
        if (alarmCount != null && alarmCount != "") {
            cr.andCondition("ALARM_COUNT='" + alarmCount + "'");
        }
        cr.andCondition(temp);
        list = anElectricDayViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
