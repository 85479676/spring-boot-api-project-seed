package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPointItemWxView;
import com.company.project.service.PaPatrolPointItemWxViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/11.
 */
@RestController
@RequestMapping("/pointitemwxview")
public class PaPatrolPointItemWxViewController extends DomainedResource {
    @Resource
    private PaPatrolPointItemWxViewService paPatrolPointItemWxViewService;

    @PostMapping("/add")
    public Result add(PaPatrolPointItemWxView paPatrolPointItemWxView) {
        paPatrolPointItemWxViewService.save(paPatrolPointItemWxView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaPatrolPointItemWxView paPatrolPointItemWxView = paPatrolPointItemWxViewService.findById(unid);
        paPatrolPointItemWxView.setFlagDel(true);
        paPatrolPointItemWxViewService.update(paPatrolPointItemWxView);
        return ResultGenerator.genSuccessResult(paPatrolPointItemWxView);
    }

    @PutMapping("/update")
    public Result update(PaPatrolPointItemWxView paPatrolPointItemWxView) {
        paPatrolPointItemWxViewService.update(paPatrolPointItemWxView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaPatrolPointItemWxView paPatrolPointItemWxView = paPatrolPointItemWxViewService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPointItemWxView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String patrolPointUnid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaPatrolPointItemWxView> list = null;
        Condition condition = new Condition(PaPatrolPointItemWxView.class);
        Example.Criteria cr = condition.createCriteria();
        if (patrolPointUnid != null) {
            cr.andCondition("patrol_point_unid='" + patrolPointUnid + "'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paPatrolPointItemWxViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
