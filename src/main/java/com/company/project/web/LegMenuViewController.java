package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegMenuView;
import com.company.project.model.SysMenuView;
import com.company.project.service.LegMenuViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/22.
 * 菜单接口的查询
 */
@RestController
@RequestMapping("/menuview")
public class LegMenuViewController {
    @Resource
    private LegMenuViewService legMenuViewService;

    @PostMapping("/add")
    public Result add(LegMenuView legMenuView) {
        legMenuViewService.save(legMenuView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        legMenuViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegMenuView legMenuView) {
        legMenuViewService.update(legMenuView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegMenuView legMenuView = legMenuViewService.findById(unid);
        return ResultGenerator.genSuccessResult(legMenuView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "30") Integer size, @RequestParam(required = false) String name) {
        PageHelper.startPage(page, size);
        List<LegMenuView> list = null;
        Condition condition = new Condition(SysMenuView.class);

        if (name != null) {
            condition.createCriteria().andCondition("NAME like'%" + name + "%'").andCondition("FLAG_DEL=0");
        }
        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = legMenuViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
