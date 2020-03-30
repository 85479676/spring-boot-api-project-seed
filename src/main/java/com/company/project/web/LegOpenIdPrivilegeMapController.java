package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegOpenIdPrivilegeMap;
import com.company.project.service.LegOpenIdPrivilegeMapService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/25.
 * 用户和角色关联增删改
 */
@RestController
@RequestMapping("/openidprivilegemap")
public class LegOpenIdPrivilegeMapController {
    @Resource
    private LegOpenIdPrivilegeMapService legOpenIdPrivilegeMapService;

    @PostMapping("/add")
    public Result add(LegOpenIdPrivilegeMap legOpenIdPrivilegeMap) {
        legOpenIdPrivilegeMapService.save(legOpenIdPrivilegeMap);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/{unid}")
    public Result delete(@PathVariable String unid, @RequestParam String privilege) {
        legOpenIdPrivilegeMapService.deleteById(unid);
        String[] menulist = privilege.split(",");
        for (String menu : menulist
        ) {
            LegOpenIdPrivilegeMap menuMap = new LegOpenIdPrivilegeMap();
            menuMap.setOpenId(unid);
            menuMap.setPrivilegeUnid(menu);
            legOpenIdPrivilegeMapService.save(menuMap);
        }
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegOpenIdPrivilegeMap legOpenIdPrivilegeMap) {
        legOpenIdPrivilegeMapService.update(legOpenIdPrivilegeMap);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegOpenIdPrivilegeMap legOpenIdPrivilegeMap = legOpenIdPrivilegeMapService.findById(unid);
        return ResultGenerator.genSuccessResult(legOpenIdPrivilegeMap);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String unid) {
        PageHelper.startPage(page, size);
        List<LegOpenIdPrivilegeMap> list = null;
        Condition condition = new Condition(LegOpenIdPrivilegeMap.class);
        Example.Criteria cr = condition.createCriteria();
        if (unid != null) {
            cr.andCondition("OPEN_ID='" + unid + "'");
        }
        list = legOpenIdPrivilegeMapService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
