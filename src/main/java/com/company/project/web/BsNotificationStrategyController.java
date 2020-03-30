package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsNotificationStrategy;
import com.company.project.service.BsNotificationStrategyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 通知策略表
 * Created by CodeGenerator on 2020/02/28.
 */
@RestController
@RequestMapping("/notificationstrategy")
public class BsNotificationStrategyController {
    @Resource
    private BsNotificationStrategyService bsNotificationStrategyService;

    @PostMapping("/add")
    public Result add(BsNotificationStrategy bsNotificationStrategy) {
        bsNotificationStrategyService.save(bsNotificationStrategy);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        BsNotificationStrategy bsNotificationStrategy = bsNotificationStrategyService.findById(unid);
        bsNotificationStrategy.setFlagDel(true);
        bsNotificationStrategyService.update(bsNotificationStrategy);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(BsNotificationStrategy bsNotificationStrategy) {
        bsNotificationStrategyService.update(bsNotificationStrategy);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        BsNotificationStrategy bsNotificationStrategy = bsNotificationStrategyService.findById(unid);
        return ResultGenerator.genSuccessResult(bsNotificationStrategy);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BsNotificationStrategy> list = bsNotificationStrategyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
