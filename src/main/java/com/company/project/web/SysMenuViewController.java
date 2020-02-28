package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.SysMenuView;
import com.company.project.service.SysMenuViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * 菜单接口
 * Created by CodeGenerator on 2020/02/17.
 */
@RestController
@RequestMapping("/menu")
public class SysMenuViewController {
//    private static Log log = (Log) Log.getLog(SysMenuViewController.this.sysMenuViewService.toString());

    @Resource
    private SysMenuViewService sysMenuViewService;

    @PostMapping("/add")
    public Result add(SysMenuView sysMenuView) {
        sysMenuViewService.save(sysMenuView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam String unid) {
        sysMenuViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(SysMenuView sysMenuView) {
        sysMenuViewService.update(sysMenuView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam String id) {
        SysMenuView sysMenuView = sysMenuViewService.findById(id);
        return ResultGenerator.genSuccessResult(sysMenuView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name) {
        PageHelper.startPage(page, size);
        List<SysMenuView> list = null;
        Condition condition = new Condition(SysMenuView.class);

        if (name != null) {
            condition.createCriteria().andCondition("NAME like'%" + name + "%'").andCondition("FLAG_DEL=0");
        }
        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = sysMenuViewService.findByCondition(condition);

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
