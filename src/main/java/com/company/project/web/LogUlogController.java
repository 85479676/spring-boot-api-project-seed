package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AnWaterDayView;
import com.company.project.model.LogUlog;
import com.company.project.service.LogUlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/25.
 * 操作日志增删改查
 */
@RestController
@RequestMapping("/ulog")
public class LogUlogController {
    @Resource
    private LogUlogService logUlogService;

    @PostMapping("/add")
    public Result add(LogUlog logUlog) {
        logUlogService.save(logUlog);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LogUlog logUlog = logUlogService.findById(unid);
        logUlog.setFlagDel(true);
        logUlogService.update(logUlog);
//        logUlogService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LogUlog logUlog) {
        logUlogService.update(logUlog);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogUlog logUlog = logUlogService.findById(unid);
        return ResultGenerator.genSuccessResult(logUlog);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo) {
        PageHelper.startPage(page, size);
        List<LogUlog> list = null;
        Condition condition = new Condition(AnWaterDayView.class);
        Example.Criteria cr = condition.createCriteria();
        if (datimeFrom != null && datimeFrom != "" && datimeTo != null && datimeTo != "") {
            cr.andCondition("DATIME_SYS BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo + "'");
            condition.orderBy("aiid").desc();
        }
        cr.andCondition("FLAG_DEL=0");
        list = logUlogService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
