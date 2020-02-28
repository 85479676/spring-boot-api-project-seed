package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegMenu;
import com.company.project.service.LegMenuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/22.
 * 菜单接口的增删改
 */
@RestController
@RequestMapping("/legmenu")
public class LegMenuController {
    @Resource
    private LegMenuService legMenuService;

    @PostMapping("/add")
    public Result add(LegMenu legMenu) {
        legMenuService.save(legMenu);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LegMenu legMenu = legMenuService.findById(unid);
        legMenu.setFlagDel(true);
        legMenuService.update(legMenu);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegMenu legMenu) {
        legMenuService.update(legMenu);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegMenu legMenu = legMenuService.findById(unid);
        return ResultGenerator.genSuccessResult(legMenu);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LegMenu> list = legMenuService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
