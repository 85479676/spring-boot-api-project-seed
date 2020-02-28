package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegOpenidView;
import com.company.project.service.LegOpenidViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/19.
 * 用户查询
 */
@RestController
@RequestMapping("/openid")
public class LegOpenidViewController {
    @Resource
    private LegOpenidViewService legOpenidViewService;

    @PostMapping("/add")
    public Result add(LegOpenidView legOpenidView) {
        legOpenidViewService.save(legOpenidView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam String unid) {
        legOpenidViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegOpenidView legOpenidView) {
        legOpenidViewService.update(legOpenidView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam String id) {
        LegOpenidView legOpenidView = legOpenidViewService.findById(id);
        return ResultGenerator.genSuccessResult(legOpenidView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String nameLogin) {
        PageHelper.startPage(page, size);
        List<LegOpenidView> list = null;
        Condition condition = new Condition(LegOpenidView.class);
        if (nameLogin != null ) {
            condition.createCriteria().andCondition("NAME_LOGIN like'%" + nameLogin + "%'").andCondition("FLAG_DEL=0");
        }
        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = legOpenidViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}