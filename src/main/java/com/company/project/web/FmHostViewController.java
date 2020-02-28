package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmHostView;
import com.company.project.model.LegAuthorityView;
import com.company.project.service.FmHostViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/26.
 */
@RestController
@RequestMapping("/fmhostview")
public class FmHostViewController {
    @Resource
    private FmHostViewService fmHostViewService;

    @PostMapping("/add")
    public Result add(FmHostView fmHostView) {
        fmHostViewService.save(fmHostView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        fmHostViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(FmHostView fmHostView) {
        fmHostViewService.update(fmHostView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmHostView fmHostView = fmHostViewService.findById(unid);
        return ResultGenerator.genSuccessResult(fmHostView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String name, @RequestParam(required = false) String domainName) {
        PageHelper.startPage(page, size);
        List<FmHostView> list = null;
        Condition condition = new Condition(FmHostView.class);
        if (name != null) {
            condition.createCriteria().andCondition("NAME like'%" + name + "%'").andCondition("FLAG_DEL=0");
        }

        if (domainName != null) {
            condition.createCriteria().andCondition("DOMAIN_NAME like'%" + domainName + "%'").andCondition("FLAG_DEL=0");
        }
        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = fmHostViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
