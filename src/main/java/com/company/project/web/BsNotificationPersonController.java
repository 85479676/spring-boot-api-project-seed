package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsNotificationPerson;
import com.company.project.service.BsNotificationPersonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/28.
 */
@RestController
@RequestMapping("/notificationperson")
public class BsNotificationPersonController {
    @Resource
    private BsNotificationPersonService bsNotificationPersonService;

    @PostMapping("/add")
    public Result add(BsNotificationPerson bsNotificationPerson) {
        bsNotificationPersonService.save(bsNotificationPerson);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        BsNotificationPerson bsNotificationPerson = bsNotificationPersonService.findById(unid);
        bsNotificationPerson.setFlagDel(true);
        bsNotificationPersonService.update(bsNotificationPerson);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(BsNotificationPerson bsNotificationPerson) {
        bsNotificationPersonService.update(bsNotificationPerson);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        BsNotificationPerson bsNotificationPerson = bsNotificationPersonService.findById(unid);
        return ResultGenerator.genSuccessResult(bsNotificationPerson);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BsNotificationPerson> list = bsNotificationPersonService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
