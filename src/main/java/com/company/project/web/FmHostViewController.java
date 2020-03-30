package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmHostView;
import com.company.project.service.FmHostViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/26.
 */
@RestController
@RequestMapping("/fmhostview")
public class FmHostViewController extends DomainedResource {
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
    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size,
                       @RequestParam(required = false) String domainUnid, @RequestParam(required = false) String name, @RequestParam(required = false) String domainName) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmHostView> list = null;
        Condition condition = new Condition(FmHostView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("NAME like'%" + name + "%'");
        }

        if (domainName != null) {
            cr.andCondition("DOMAIN_NAME like'%" + domainName + "%'");
        }
        cr.andCondition("FLAG_DEL=0");
        cr.andCondition(temp);
        list = fmHostViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
