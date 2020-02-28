package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsNotificationLogView;
import com.company.project.service.BsNotificationLogViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 通知测试和设备关联视图查询
 * Created by CodeGenerator on 2020/02/28.
 */
@RestController
@RequestMapping("/notificationview")
public class BsNotificationLogViewController {
    @Resource
    private BsNotificationLogViewService bsNotificationLogViewService;

    @PostMapping("/add")
    public Result add(BsNotificationLogView bsNotificationLogView) {
        bsNotificationLogViewService.save(bsNotificationLogView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        bsNotificationLogViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(BsNotificationLogView bsNotificationLogView) {
        bsNotificationLogViewService.update(bsNotificationLogView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        BsNotificationLogView bsNotificationLogView = bsNotificationLogViewService.findById(unid);
        return ResultGenerator.genSuccessResult(bsNotificationLogView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BsNotificationLogView> list = bsNotificationLogViewService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
