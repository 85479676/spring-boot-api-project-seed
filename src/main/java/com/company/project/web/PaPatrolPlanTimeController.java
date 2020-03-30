package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPlanTime;
import com.company.project.model.PaPatrolPlanTimeView;
import com.company.project.service.PaPatrolPlanTimeService;
import com.company.project.service.PaPatrolPlanTimeViewService;
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
@RequestMapping("/papatrolplantime")
public class PaPatrolPlanTimeController extends DomainedResource {
    @Resource
    private PaPatrolPlanTimeService paPatrolPlanTimeService;
    @Resource
    PaPatrolPlanTimeViewService paPatrolPlanTimeViewService;

    @PostMapping("/add")
    public Result add(PaPatrolPlanTime paPatrolPlanTime) {
        paPatrolPlanTimeService.save(paPatrolPlanTime);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaPatrolPlanTime paPatrolPlanTime = paPatrolPlanTimeService.findById(unid);
        paPatrolPlanTime.setFlagDel(true);
        paPatrolPlanTimeService.update(paPatrolPlanTime);
        return ResultGenerator.genSuccessResult(paPatrolPlanTime);
    }

    @PutMapping("/update")
    public Result update(PaPatrolPlanTime paPatrolPlanTime) {
        paPatrolPlanTimeService.update(paPatrolPlanTime);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaPatrolPlanTime paPatrolPlanTime = paPatrolPlanTimeService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPlanTime);
    }
//    @GetMapping("/list")
//    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
//        String temp = this.tokenValue(request);
//        PageHelper.startPage(page, size);
//        List<PaPatrolPlanTime> list = null;
//        Condition condition = new Condition(PaPatrolPlanTime.class);
//        Example.Criteria cr = condition.createCriteria();
//        list = paPatrolPlanTimeService.findByCondition(condition);
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//
//    }

    /**
     * 关联查询显示
     *
     * @param request
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/list")
    public Result listView(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                           @RequestParam(required = false) String dateName, @RequestParam(required = false) String paPlanUnid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaPatrolPlanTimeView> list = null;
        Condition condition = new Condition(PaPatrolPlanTimeView.class);
        Example.Criteria cr = condition.createCriteria();
        if (paPlanUnid != null) {
            cr.andCondition("pa_plan_unid='" + paPlanUnid + "'");
        }
        if (dateName != null) {
            cr.andCondition("date_name ='" + dateName + "'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paPatrolPlanTimeViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }


}
