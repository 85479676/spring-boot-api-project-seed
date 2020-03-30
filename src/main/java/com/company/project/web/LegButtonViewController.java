package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegButtonView;
import com.company.project.service.LegButtonViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * 按钮接口
 * 王永杰
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/buttonview")
public class LegButtonViewController extends DomainedResource {
    @Resource
    private LegButtonViewService legButtonViewService;

    @PostMapping("/add")
    public Result add(LegButtonView legButtonView) {
        legButtonViewService.save(legButtonView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        legButtonViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody LegButtonView legButtonView) {
        legButtonViewService.update(legButtonView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegButtonView legButtonView = legButtonViewService.findById(unid);
        return ResultGenerator.genSuccessResult(legButtonView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name) {
        PageHelper.startPage(page, size);
        List<LegButtonView> list = null;
        Condition condition = new Condition(LegButtonView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("NAME like'%" + name + "%'");
        }
        cr.andCondition("FLAG_DEL=0");
        list = legButtonViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
