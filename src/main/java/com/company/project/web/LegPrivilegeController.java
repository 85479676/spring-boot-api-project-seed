package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegPrivilege;
import com.company.project.service.LegPrivilegeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色接口
 * 增删改
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/privilege")
public class LegPrivilegeController {
    @Resource
    private LegPrivilegeService legPrivilegeService;

    @PostMapping("/add")
    public Result add( LegPrivilege legPrivilege) {
        legPrivilegeService.save(legPrivilege);
        return ResultGenerator.genSuccessResult();
    }


    //    public Result delete(@PathVariable String unid) {
//        legPrivilegeService.deleteById(unid);
//        return ResultGenerator.genSuccessResult();
//    }
    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LegPrivilege legPrivilege = legPrivilegeService.findById(unid);
        legPrivilege.setFlagDel(true);
        legPrivilegeService.update(legPrivilege);
        return ResultGenerator.genSuccessResult(legPrivilege);
    }

    @PutMapping("/update")
    public Result update(LegPrivilege legPrivilege) {
        legPrivilegeService.update(legPrivilege);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {

        LegPrivilege legPrivilege = legPrivilegeService.findById(unid);
        legPrivilege.setFlagDel(true);
        legPrivilegeService.update(legPrivilege);
        return ResultGenerator.genSuccessResult(legPrivilege);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size) {
        PageHelper.startPage(page, size);
        List<LegPrivilege> list = legPrivilegeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
