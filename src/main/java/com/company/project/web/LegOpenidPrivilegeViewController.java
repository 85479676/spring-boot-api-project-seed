package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegOpenIdPrivilegeMap;
import com.company.project.model.LegOpenidPrivilegeView;
import com.company.project.service.LegOpenidPrivilegeViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/25.
 * 用户和角色的视图查询
 */
@RestController
@RequestMapping("/openidprivilegeview")
public class LegOpenidPrivilegeViewController {
    @Resource
    private LegOpenidPrivilegeViewService legOpenidPrivilegeViewService;

    @PostMapping("/add")
    public Result add(LegOpenidPrivilegeView legOpenidPrivilegeView) {
        legOpenidPrivilegeViewService.save(legOpenidPrivilegeView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        legOpenidPrivilegeViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegOpenidPrivilegeView legOpenidPrivilegeView) {
        legOpenidPrivilegeViewService.update(legOpenidPrivilegeView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegOpenidPrivilegeView legOpenidPrivilegeView = legOpenidPrivilegeViewService.findById(unid);
        return ResultGenerator.genSuccessResult(legOpenidPrivilegeView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String unid) {
        PageHelper.startPage(page, size);
        List<LegOpenidPrivilegeView> list = null;
        Condition condition = new Condition(LegOpenidPrivilegeView.class);
        if (unid != null) {
            condition.createCriteria().andCondition("OPEN_ID='" + unid + "'");
        }
        list = legOpenidPrivilegeViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
