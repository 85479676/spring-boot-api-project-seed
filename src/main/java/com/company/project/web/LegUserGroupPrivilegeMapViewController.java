package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegUserGroupPrivilegeMap;
import com.company.project.model.LegUserGroupPrivilegeMapView;
import com.company.project.service.LegUserGroupPrivilegeMapViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/25.
 * 用户组和角色的视图查询
 */
@RestController
@RequestMapping("/groupprivilegemapview")
public class LegUserGroupPrivilegeMapViewController {
    @Resource
    private LegUserGroupPrivilegeMapViewService legUserGroupPrivilegeMapViewService;

    @PostMapping("/add")
    public Result add(LegUserGroupPrivilegeMapView legUserGroupPrivilegeMapView) {
        legUserGroupPrivilegeMapViewService.save(legUserGroupPrivilegeMapView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        legUserGroupPrivilegeMapViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegUserGroupPrivilegeMapView legUserGroupPrivilegeMapView) {
        legUserGroupPrivilegeMapViewService.update(legUserGroupPrivilegeMapView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegUserGroupPrivilegeMapView legUserGroupPrivilegeMapView = legUserGroupPrivilegeMapViewService.findById(unid);
        return ResultGenerator.genSuccessResult(legUserGroupPrivilegeMapView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String unid) {
        PageHelper.startPage(page, size);
        List<LegUserGroupPrivilegeMapView> list = null;
        Condition condition = new Condition(LegUserGroupPrivilegeMapView.class);
        if (unid != null) {
            condition.createCriteria().andCondition("USER_GROUP_USER='" + unid + "'");
        }
        list = legUserGroupPrivilegeMapViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
