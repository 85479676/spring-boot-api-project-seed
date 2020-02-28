package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegUserGroupDomainMap;
import com.company.project.model.LegUserGroupPrivilegeMap;
import com.company.project.service.LegUserGroupPrivilegeMapService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/25.
 * 用户组和角色关联增删改
 */
@RestController
@RequestMapping("/usergroupprivilege")
public class LegUserGroupPrivilegeMapController {
    @Resource
    private LegUserGroupPrivilegeMapService legUserGroupPrivilegeMapService;

    @PostMapping("/add")
    public Result add(LegUserGroupPrivilegeMap legUserGroupPrivilegeMap) {
        legUserGroupPrivilegeMapService.save(legUserGroupPrivilegeMap);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/{unid}")
    public Result delete(@PathVariable String unid, @RequestParam(required = false) String privilegeUnid) {
        legUserGroupPrivilegeMapService.deleteById(unid);
        String[] menulist = privilegeUnid.split(",");
        for (String menu : menulist
        ) {
            LegUserGroupPrivilegeMap menuMap = new LegUserGroupPrivilegeMap();
            menuMap.setUserGroupUser(unid);
            menuMap.setPrivilegeUnid(menu);
            legUserGroupPrivilegeMapService.save(menuMap);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegUserGroupPrivilegeMap legUserGroupPrivilegeMap) {
        legUserGroupPrivilegeMapService.update(legUserGroupPrivilegeMap);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegUserGroupPrivilegeMap legUserGroupPrivilegeMap = legUserGroupPrivilegeMapService.findById(unid);
        return ResultGenerator.genSuccessResult(legUserGroupPrivilegeMap);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "30") Integer size, @RequestParam(required = false) String unid) {
        PageHelper.startPage(page, size);
        List<LegUserGroupPrivilegeMap> list = null;
        Condition condition = new Condition(LegUserGroupPrivilegeMap.class);
        if (unid != null) {
            condition.createCriteria().andCondition("USER_GROUP_USER='" + unid + "'");
        }
        list = legUserGroupPrivilegeMapService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
