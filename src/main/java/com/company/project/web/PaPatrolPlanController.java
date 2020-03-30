package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPlan;
import com.company.project.model.PaPatrolPlanView;
import com.company.project.service.PaPatrolPlanService;
import com.company.project.service.PaPatrolPlanViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 巡检计划
 * 查询为巡检和分组关联查询
 * 王永杰
 * Created by CodeGenerator on 2020/03/05.
 */

@RestController
@RequestMapping("/papatrolplan")
public class PaPatrolPlanController extends DomainedResource {
    @Resource
    private PaPatrolPlanService paPatrolPlanService;
    /**
     * 关联表查询
     */
    @Resource
    private PaPatrolPlanViewService paPatrolPlanViewService;

    @PostMapping("/add")
    public Result add(PaPatrolPlan paPatrolPlan) {
        paPatrolPlanService.save(paPatrolPlan);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaPatrolPlan paPatrolPlan = paPatrolPlanService.findById(unid);
        paPatrolPlan.setFlagDel(true);
        paPatrolPlanService.update(paPatrolPlan);
        return ResultGenerator.genSuccessResult(paPatrolPlan);
    }

    @PutMapping("/update")
    public Result update(PaPatrolPlan paPatrolPlan) {
        paPatrolPlanService.update(paPatrolPlan);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaPatrolPlan paPatrolPlan = paPatrolPlanService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPlan);
    }


    /**
     * 计划表和分组关联权限查询和条件
     * 王
     *
     * @param request
     * @param page
     * @param size
     * @return
     */
//
    @GetMapping("/list")
    public Result listView(HttpServletRequest request,@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                           @RequestParam(required = false) String name) {
        String temp = this.tokenValue(request,domainUnid);
        PageHelper.startPage(page, size);
        List<PaPatrolPlanView> list = null;
        Condition condition = new Condition(PaPatrolPlanView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paPatrolPlanViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
