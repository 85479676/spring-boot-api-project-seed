package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsNotificationLog;
import com.company.project.service.BsNotificationLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/16.
 */
@RestController
@RequestMapping("/notificationlog")
public class BsNotificationLogController extends DomainedResource {
    @Resource
    private BsNotificationLogService bsNotificationLogService;

    @PostMapping("/add")
    public Result add(BsNotificationLog bsNotificationLog) {
        bsNotificationLogService.save(bsNotificationLog);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        BsNotificationLog bsNotificationLog = bsNotificationLogService.findById(unid);
        bsNotificationLog.setFlagDel(true);
        bsNotificationLogService.update(bsNotificationLog);
        return ResultGenerator.genSuccessResult(bsNotificationLog);
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
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo, @RequestParam(required = false) String name) {
        PageHelper.startPage(page, size);
        List<BsNotificationLog> list = null;
        Condition condition = new Condition(BsNotificationLog.class);
        Example.Criteria cr = condition.createCriteria();
        if (datimeFrom != null && datimeFrom != "" && datimeTo != null && datimeTo != "" && name != null) {
            cr.andCondition("system_dtime BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo + "'");
        }
        if (name != null && name != "") {
            cr.andCondition("name like'%" + name + "%'");
        }
        condition.orderBy("system_dtime").desc();

        list = bsNotificationLogService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
