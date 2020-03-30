package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegUserGroupDomainMap;
import com.company.project.service.LegUserGroupDomainMapService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/25.
 * 用户组和分组的增删改
 */
@RestController
@RequestMapping("/usergroupdomain")
public class LegUserGroupDomainMapController {
    @Resource
    private LegUserGroupDomainMapService legUserGroupDomainMapService;

    @PostMapping("/add")
    public Result add(LegUserGroupDomainMap legUserGroupDomainMap) {
        legUserGroupDomainMapService.save(legUserGroupDomainMap);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/{unid}")
    public Result delete(@PathVariable String unid, @RequestParam String privilegeUnid) {
        legUserGroupDomainMapService.deleteById(unid);
        String[] menulist = privilegeUnid.split(",");
        for (String menu : menulist
        ) {
            LegUserGroupDomainMap menuMap = new LegUserGroupDomainMap();
            menuMap.setUserGroupUnid(unid);
            menuMap.setDomainUnid(menu);
            legUserGroupDomainMapService.save(menuMap);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegUserGroupDomainMap legUserGroupDomainMap) {
        legUserGroupDomainMapService.update(legUserGroupDomainMap);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegUserGroupDomainMap legUserGroupDomainMap = legUserGroupDomainMapService.findById(unid);
        return ResultGenerator.genSuccessResult(legUserGroupDomainMap);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "30") Integer size, @RequestParam(required = false) String unid) {
        PageHelper.startPage(page, size);
        List<LegUserGroupDomainMap> list = null;
        Condition condition = new Condition(LegUserGroupDomainMap.class);
        Example.Criteria cr = condition.createCriteria();
        if (unid != null) {
            cr.andCondition("USER_GROUP_UNID='" + unid + "'");
        }
        list = legUserGroupDomainMapService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
