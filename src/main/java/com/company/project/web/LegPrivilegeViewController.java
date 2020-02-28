package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegPrivilegeView;
import com.company.project.service.LegPrivilegeViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色接口
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/privileges")
public class LegPrivilegeViewController {
    @Resource
    private LegPrivilegeViewService legPrivilegeViewService;

    @PostMapping("/add")
    public Result add(LegPrivilegeView legPrivilegeView) {
        legPrivilegeViewService.save(legPrivilegeView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam String unid) {
        legPrivilegeViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegPrivilegeView legPrivilegeView) {
        legPrivilegeViewService.update(legPrivilegeView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam String id) {
        LegPrivilegeView legPrivilegeView = legPrivilegeViewService.findById(id);
        return ResultGenerator.genSuccessResult(legPrivilegeView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name) {
        PageHelper.startPage(page, size);
        List<LegPrivilegeView> list = null;
        Condition condition = new Condition(LegPrivilegeView.class);
        if (name != null) {
            condition.createCriteria().andCondition("NAME like'%" + name + "%'").andCondition("FLAG_DEL=0");
        }
        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = legPrivilegeViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
