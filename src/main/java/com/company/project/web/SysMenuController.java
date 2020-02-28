package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.SysMenu;
import com.company.project.service.SysMenuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单接口
 * 增删改
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/sysmenu")
public class SysMenuController {
    @Resource
    private SysMenuService sysMenuService;

    @PostMapping("/add")
    public Result add( SysMenu sysMenu) {
        sysMenuService.save(sysMenu);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        SysMenu sysMenu = sysMenuService.findById(unid);
        sysMenu.setFlagDel(true);
        sysMenuService.update(sysMenu);
//        sysMenuService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(SysMenu sysMenu) {
        sysMenuService.update(sysMenu);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@RequestParam String unid) {
        SysMenu sysMenu = sysMenuService.findById(unid);
        return ResultGenerator.genSuccessResult(sysMenu);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size) {
        PageHelper.startPage(page, size);
        List<SysMenu> list = sysMenuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
