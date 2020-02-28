package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegUserGroupView;
import com.company.project.model.MdModelView;
import com.company.project.service.LegUserGroupViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/20.
 * 用户组视图查询
 */
@RestController
@RequestMapping("/usergroupview")
public class LegUserGroupViewController {
    @Resource
    private LegUserGroupViewService legUserGroupViewService;

    @PostMapping("/add")
    public Result add(@RequestBody LegUserGroupView legUserGroupView) {
        legUserGroupViewService.save(legUserGroupView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        legUserGroupViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegUserGroupView legUserGroupView) {
        legUserGroupViewService.update(legUserGroupView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegUserGroupView legUserGroupView = legUserGroupViewService.findById(unid);
        return ResultGenerator.genSuccessResult(legUserGroupView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String name) {
        PageHelper.startPage(page, size);
        List<LegUserGroupView> list = null;

        Condition condition = new Condition(LegUserGroupView.class);
        if (name != null) {
            condition.createCriteria().andCondition("NAME like'%" + name + "%'").andCondition("FLAG_DEL=0");
        }
        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = legUserGroupViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
