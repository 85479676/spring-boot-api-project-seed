package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AnWaterDayView;
import com.company.project.model.LogUlogView;
import com.company.project.service.LogUlogViewService;
import com.company.project.util.DateHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.activation.DataHandler;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/28.
 */
@RestController
@RequestMapping("/logulogview")
public class LogUlogViewController {
    @Resource
    private LogUlogViewService logUlogViewService;

    @PostMapping("/add")
    public Result add(LogUlogView logUlogView) {
        logUlogViewService.save(logUlogView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        logUlogViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LogUlogView logUlogView) {
        logUlogViewService.update(logUlogView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogUlogView logUlogView = logUlogViewService.findById(unid);
        return ResultGenerator.genSuccessResult(logUlogView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String datimeFrom,
                       @RequestParam(required = false) String datimeTo) {
        PageHelper.startPage(page, size);
          /**
          * 默认当天日志
          */
        datimeFrom = DateHelper.getDateYYYY_MM_DD_MIN();
        datimeTo = DateHelper.getDateYYYY_MM_DD_MAX();
        Condition condition = new Condition(LogUlogView.class);
        if (datimeFrom != null && datimeTo != null) {
            condition.createCriteria().andCondition("DATIME_SYS >='" + datimeFrom + "'").andCondition("DATIME_SYS <='" + datimeTo + "'");
            condition.orderBy("aiid").desc();
        }
        List<LogUlogView> list = logUlogViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
