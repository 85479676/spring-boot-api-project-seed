package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MdTypeView;
import com.company.project.service.MdTypeViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/10.
 */
@RestController
@RequestMapping("/md/type/view")
public class MdTypeViewController extends DomainedResource {
    @Resource
    private MdTypeViewService mdTypeViewService;

    @PostMapping("/add")
    public Result add(MdTypeView mdTypeView) {
        mdTypeViewService.save(mdTypeView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        MdTypeView mdTypeView = mdTypeViewService.findById(unid);
        mdTypeView.setFlagDel(true);
        mdTypeViewService.update(mdTypeView);
        return ResultGenerator.genSuccessResult(mdTypeView);
    }

    @PutMapping("/update")
    public Result update(MdTypeView mdTypeView) {
        mdTypeViewService.update(mdTypeView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        MdTypeView mdTypeView = mdTypeViewService.findById(unid);
        return ResultGenerator.genSuccessResult(mdTypeView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<MdTypeView> list = null;
        Condition condition = new Condition(MdTypeView.class);
        Example.Criteria cr = condition.createCriteria();
        list = mdTypeViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
