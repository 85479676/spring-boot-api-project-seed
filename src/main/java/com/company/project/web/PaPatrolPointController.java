package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPlanPointMapView;
import com.company.project.model.PaPatrolPoint;
import com.company.project.model.PaPatrolPointView;
import com.company.project.service.PaPatrolPlanPointMapViewService;
import com.company.project.service.PaPatrolPointService;
import com.company.project.service.PaPatrolPointViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 巡检点位列表
 * Created by CodeGenerator on 2020/03/05.
 */
@RestController
@RequestMapping("/papatrolpoint")
public class PaPatrolPointController extends DomainedResource {
    @Resource
    private PaPatrolPointViewService paPatrolPointViewService;

    @Resource
    private PaPatrolPointService paPatrolPointService;
    /**
     * 巡检计划点位对应详细表
     */
    @Resource
    private PaPatrolPlanPointMapViewService paPatrolPlanPointMapViewService;

    @PostMapping("/add")
    public Result add(PaPatrolPoint paPatrolPoint, @RequestParam(required = true) String name) {

        PaPatrolPoint patrolPoint = paPatrolPointService.selectGetName(name);

        if (patrolPoint == null) {
            paPatrolPoint.setName(name);
            paPatrolPointService.save(paPatrolPoint);
        } else {
            return ResultGenerator.genSuccessResult("点位名称重复，请重新输入");
        }

        return ResultGenerator.genSuccessResult("添加成功");

    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaPatrolPoint paPatrolPoint = paPatrolPointService.findById(unid);
        paPatrolPoint.setFlagDel(true);
        paPatrolPointService.update(paPatrolPoint);
        return ResultGenerator.genSuccessResult(paPatrolPoint);
    }

    @PutMapping("/update")
    public Result update(PaPatrolPoint paPatrolPoint) {
        paPatrolPointService.update(paPatrolPoint);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaPatrolPoint paPatrolPoint = paPatrolPointService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPoint);
    }

    @GetMapping("/point/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String name) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaPatrolPointView> list = null;
        Condition condition = new Condition(PaPatrolPointView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paPatrolPointViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }


    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String name, @RequestParam(required = false) String planUnid, @RequestParam(required = false) Integer status) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaPatrolPlanPointMapView> list = null;
        Condition condition = new Condition(PaPatrolPlanPointMapView.class);
        Example.Criteria cr = condition.createCriteria();

        if (status != null) {
            cr.andCondition("status=" + status + "");
        }
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        if (planUnid != null) {
            cr.andCondition("plan_unid='" + planUnid + "'");
        }

        cr.andCondition(temp).andCondition("flag_del=0");
        list = paPatrolPlanPointMapViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    @RequestMapping("/count")
    public Result count() {


        return null;
    }


}
