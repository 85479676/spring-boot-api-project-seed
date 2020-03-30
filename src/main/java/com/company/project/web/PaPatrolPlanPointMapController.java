package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPlanPointMap;
import com.company.project.model.PaPatrolPoint;
import com.company.project.service.PaPatrolPlanPointMapService;
import com.company.project.service.PaPatrolPointService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/06.
 */
@RestController
@RequestMapping("/papatrolplanpointmap")
public class PaPatrolPlanPointMapController extends DomainedResource {
    @Resource
    private PaPatrolPlanPointMapService paPatrolPlanPointMapService;


    @Resource
    private PaPatrolPointService paPatrolPointService;

    @PostMapping("/add")
    public Result add(PaPatrolPlanPointMap paPatrolPlanPointMap, @RequestParam String point) {
        String[] pointlist = point.split(",");
        for (String poiunid : pointlist
        ) {
            paPatrolPlanPointMap.setPointUnid(poiunid);
            PaPatrolPoint paPatrolPoint = paPatrolPointService.findById(poiunid);
            paPatrolPoint.setState(true);

            paPatrolPlanPointMapService.save(paPatrolPlanPointMap);
            paPatrolPointService.update(paPatrolPoint);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 修改计划和点位绑定
     *
     * @param planUnid
     * @param point
     * @return
     */
    @PostMapping("/{unid}")
    public Result delete(@PathVariable String planUnid, @RequestParam String point) {
        paPatrolPlanPointMapService.deleteById(planUnid);
        String[] pointlist = point.split(",");
        for (String pounid : pointlist
        ) {
            PaPatrolPlanPointMap menuMap = new PaPatrolPlanPointMap();


            menuMap.setPlanUnid(planUnid);
            menuMap.setPointUnid(pounid);

            paPatrolPlanPointMapService.save(menuMap);
        }
        return ResultGenerator.genSuccessResult();
    }


    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
//        PaPatrolPlanPointMap paPatrolPlanPointMap = paPatrolPlanPointMapService.findById(unid);
//        paPatrolPlanPointMap.setFlagDel(true);
        paPatrolPlanPointMapService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(PaPatrolPlanPointMap paPatrolPlanPointMap) {
        paPatrolPlanPointMapService.update(paPatrolPlanPointMap);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaPatrolPlanPointMap paPatrolPlanPointMap = paPatrolPlanPointMapService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPlanPointMap);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaPatrolPlanPointMap> list = null;
        Condition condition = new Condition(PaPatrolPlanPointMap.class);
        Example.Criteria cr = condition.createCriteria();
        list = paPatrolPlanPointMapService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
