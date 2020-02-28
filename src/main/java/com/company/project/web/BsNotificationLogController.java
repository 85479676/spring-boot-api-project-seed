package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsNotificationLog;
import com.company.project.service.BsNotificationLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/02/28.
*/
@RestController
@RequestMapping("/notification")
public class BsNotificationLogController {
    @Resource
    private BsNotificationLogService bsNotificationLogService;

    @PostMapping("/add")
    public Result add(BsNotificationLog bsNotificationLog) {
        bsNotificationLogService.save(bsNotificationLog);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        bsNotificationLogService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(BsNotificationLog bsNotificationLog) {
        bsNotificationLogService.update(bsNotificationLog);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        BsNotificationLog bsNotificationLog = bsNotificationLogService.findById(unid);
        return ResultGenerator.genSuccessResult(bsNotificationLog);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BsNotificationLog> list = bsNotificationLogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
