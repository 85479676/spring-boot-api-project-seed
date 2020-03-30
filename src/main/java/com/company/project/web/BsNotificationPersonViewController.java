package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsNotificationPersonView;
import com.company.project.service.BsNotificationPersonViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 通知人姓名和策略名称
 * Created by CodeGenerator on 2020/02/29.
 */
@RestController
@RequestMapping("/notificationpersonview")
public class BsNotificationPersonViewController extends DomainedResource {
    @Resource
    private BsNotificationPersonViewService bsNotificationPersonViewService;

    @PostMapping("/add")
    public Result add(BsNotificationPersonView bsNotificationPersonView) {
        bsNotificationPersonViewService.save(bsNotificationPersonView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        bsNotificationPersonViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(BsNotificationPersonView bsNotificationPersonView) {
        bsNotificationPersonViewService.update(bsNotificationPersonView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        BsNotificationPersonView bsNotificationPersonView = bsNotificationPersonViewService.findById(unid);
        return ResultGenerator.genSuccessResult(bsNotificationPersonView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required =
            false) String name, @RequestParam(required = false) String notifname, @RequestParam(required = false) String domainUnid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<BsNotificationPersonView> list = null;
        Condition condition = new Condition(BsNotificationPersonView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("NAME like'%" + name + "%'");
            condition.orderBy("systemDtime").desc();
        }
        if (notifname != null) {
            cr.andCondition("NOTIF_NAME like'%" + notifname + "%'");
        }
        cr.andCondition("FLAG_DEL=0");
        cr.andCondition(temp);
        list = bsNotificationPersonViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
