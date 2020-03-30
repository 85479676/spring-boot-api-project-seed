package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsNotificationStrategyView;
import com.company.project.model.LegUserGroupPrivilegeMapView;
import com.company.project.service.BsNotificationStrategyViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 通知策略和设备关联
 * Created by CodeGenerator on 2020/02/29.
 */
@RestController
@RequestMapping("/notificationstrategyview")
public class BsNotificationStrategyViewController extends DomainedResource {
    @Resource
    private BsNotificationStrategyViewService bsNotificationStrategyViewService;

    @PostMapping("/add")
    public Result add(BsNotificationStrategyView bsNotificationStrategyView) {
        bsNotificationStrategyViewService.save(bsNotificationStrategyView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        bsNotificationStrategyViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(BsNotificationStrategyView bsNotificationStrategyView) {
        bsNotificationStrategyViewService.update(bsNotificationStrategyView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        BsNotificationStrategyView bsNotificationStrategyView = bsNotificationStrategyViewService.findById(unid);
        return ResultGenerator.genSuccessResult(bsNotificationStrategyView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name,
                       @RequestParam(required = false) String facilityName, @RequestParam(required = false) String domainUnid, @RequestParam(required = false) String unid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<BsNotificationStrategyView> list = null;
        Condition condition = new Condition(LegUserGroupPrivilegeMapView.class);
        Example.Criteria cr = condition.createCriteria();
        //策略名称查询
        if (name != null) {
            cr.andCondition("NAME like'%" + name + "%'");
        }
        //设备名称查询
        if (facilityName != null) {
            cr.andCondition("FACILITY_NAME like'%" + facilityName + "%'");
        }
        if (unid != null) {
            cr.andCondition("UNID ='" + unid + "'");

        }
        cr.andCondition("FLAG_DEL=0");
        cr.andCondition(temp);
        list = bsNotificationStrategyViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
