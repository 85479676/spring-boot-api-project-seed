package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegPrivilegeMenuMap;
import com.company.project.model.LegPrivilegeView;
import com.company.project.service.LegButtonService;
import com.company.project.service.LegPrivilegeMenuMapService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/25.
 * 角色和菜单的关联增删改
 */
@RestController
@RequestMapping("/legprivilegemenu")
public class LegPrivilegeMenuMapController {
    @Resource
    private LegPrivilegeMenuMapService legPrivilegeMenuMapService;

    @PostMapping("/add")
    public Result add(LegPrivilegeMenuMap legPrivilegeMenuMap) {
        legPrivilegeMenuMapService.save(legPrivilegeMenuMap);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/{unid}")
    public Result delete(@PathVariable String unid, @RequestParam String[] menunid) {
        legPrivilegeMenuMapService.deleteById(unid);
        System.out.println(menunid.toString());
      String[] menulist =menunid;
        for (String menu : menulist
        ) {
            LegPrivilegeMenuMap menuMap = new LegPrivilegeMenuMap();
            menuMap.setMenuUnid(menu);
            menuMap.setPrivilegeUnid(unid);
            legPrivilegeMenuMapService.save(menuMap);

        }
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestParam String unid) {

        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/s")
    public Result result(Condition condition) {
        return null;
    }


    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LegPrivilegeMenuMap> list = legPrivilegeMenuMapService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
