package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MaDeductionItemTypeView;
import com.company.project.model.MaDeductionItemTypeViews;
import com.company.project.service.MaDeductionItemTypeViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/18.
*/
@RestController
@RequestMapping("/deductionitemtypeview")
public class MaDeductionItemTypeViewController extends DomainedResource{
     @Resource
     private MaDeductionItemTypeViewService maDeductionItemTypeViewService;

     @PostMapping("/add")
     public Result add(MaDeductionItemTypeView maDeductionItemTypeView) {
        maDeductionItemTypeViewService.save(maDeductionItemTypeView);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        MaDeductionItemTypeView maDeductionItemTypeView = maDeductionItemTypeViewService.findById(unid);
//        maDeductionItemTypeView.setFlagDel(true);
        maDeductionItemTypeViewService.update(maDeductionItemTypeView);
        return ResultGenerator.genSuccessResult(maDeductionItemTypeView);
     }

     @PutMapping("/update")
     public Result update(MaDeductionItemTypeView maDeductionItemTypeView) {
        maDeductionItemTypeViewService.update(maDeductionItemTypeView);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        MaDeductionItemTypeView maDeductionItemTypeView = maDeductionItemTypeViewService.findById(unid);
        return ResultGenerator.genSuccessResult(maDeductionItemTypeView);
     }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<MaDeductionItemTypeView> list = null;
        Condition condition = new Condition(MaDeductionItemTypeView.class);
        Example.Criteria cr = condition.createCriteria();
        cr.andCondition(temp);
        list = maDeductionItemTypeViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }

    @GetMapping("/mark/list")
    public Result listMark(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<MaDeductionItemTypeViews> list  = maDeductionItemTypeViewService.getMark();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }

}
