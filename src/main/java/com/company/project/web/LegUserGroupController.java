package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegUserGroup;
import com.company.project.service.LegUserGroupService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/02/20.
 * 用户组接口增删改
*/
@RestController
@RequestMapping("/usergroup")
public class LegUserGroupController {
    @Resource
    private LegUserGroupService legUserGroupService;

    @PostMapping("/add")
    public Result add( LegUserGroup legUserGroup) {

        legUserGroupService.save(legUserGroup);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LegUserGroup legUserGroup = legUserGroupService.findById(unid);
        legUserGroup.setFlagDel(true);
        legUserGroupService.update(legUserGroup);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegUserGroup legUserGroup) {
        legUserGroupService.update(legUserGroup);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegUserGroup legUserGroup = legUserGroupService.findById(unid);
        return ResultGenerator.genSuccessResult(legUserGroup);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LegUserGroup> list = legUserGroupService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
