package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsNotificationLog;
import com.company.project.model.BsNotificationLogView;
import com.company.project.service.BsNotificationLogViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * 通知测试和设备关联视图查询
 * Created by CodeGenerator on 2020/02/28.
 */
@RestController
@RequestMapping("/notificationview")
public class BsNotificationLogViewController extends DomainedResource {
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
    public Result list( @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo, @RequestParam(required = false) String name) {

        PageHelper.startPage(page, size);
        List<BsNotificationLogView> list = null;
        Condition condition = new Condition(BsNotificationLog.class);
        Example.Criteria cr = condition.createCriteria();
        if (datimeFrom != null && datimeTo != null) {
            cr.andCondition("SYSTEM_DTIME BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo + "'");
            condition.orderBy("systemDtime").desc();
        }
        if (name != null) {
            cr.andCondition("NAME like'%" + name + "%'");
        }
        cr.andCondition("FLAG_DEL=0");
        list = bsNotificationLogViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
