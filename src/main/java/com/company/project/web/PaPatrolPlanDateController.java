package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPlanDate;
import com.company.project.model.PaPatrolPlanDateView;
import com.company.project.service.PaPatrolPlanDateService;
import com.company.project.service.PaPatrolPlanDateViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/05.
 */
@RestController
@RequestMapping("/papatrolplandate")
public class PaPatrolPlanDateController extends DomainedResource {
    @Resource
    private PaPatrolPlanDateService paPatrolPlanDateService;
    @Resource
    private PaPatrolPlanDateViewService paPatrolPlanDateViewService;

    @PostMapping("/add")
    public Result add(PaPatrolPlanDate paPatrolPlanDate) {
        paPatrolPlanDateService.save(paPatrolPlanDate);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaPatrolPlanDate paPatrolPlanDate = paPatrolPlanDateService.findById(unid);
        paPatrolPlanDate.setFlagDel(true);
        paPatrolPlanDateService.update(paPatrolPlanDate);
        return ResultGenerator.genSuccessResult(paPatrolPlanDate);
    }

    @PutMapping("/update")
    public Result update(PaPatrolPlanDate paPatrolPlanDate) {
        paPatrolPlanDateService.update(paPatrolPlanDate);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaPatrolPlanDate paPatrolPlanDate = paPatrolPlanDateService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPlanDate);
    }

//    @GetMapping("/list")
//    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
//        String temp = this.tokenValue(request);
//        PageHelper.startPage(page, size);
//        List<PaPatrolPlanDate> list = null;
//        Condition condition = new Condition(PaPatrolPlanDate.class);
//        Example.Criteria cr = condition.createCriteria();
//        list = paPatrolPlanDateService.findByCondition(condition);
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//
//    }

    /**
     * 巡检周期和分组计划map表关联
     * 王
     *
     * @param request
     * @param page
     * @param size
     * @return
     */


    @GetMapping("/list")
    public Result listView(HttpServletRequest request,@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size, @RequestParam(required =
            false) String name) {
        String temp = this.tokenValue(request,domainUnid);
        PageHelper.startPage(page, size);
        List<PaPatrolPlanDateView> list = null;
        Condition condition = new Condition(PaPatrolPlanDateView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paPatrolPlanDateViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
