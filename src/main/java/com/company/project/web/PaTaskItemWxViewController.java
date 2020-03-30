package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaTaskItemWxView;
import com.company.project.service.PaTaskItemWxViewService;
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
@RequestMapping("/taskitemwxview")
public class PaTaskItemWxViewController extends DomainedResource {
    @Resource
    private PaTaskItemWxViewService paTaskItemWxViewService;

    @PostMapping("/add")
    public Result add(PaTaskItemWxView paTaskItemWxView) {
        paTaskItemWxViewService.save(paTaskItemWxView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaTaskItemWxView paTaskItemWxView = paTaskItemWxViewService.findById(unid);
        paTaskItemWxView.setFlagDel(true);
        paTaskItemWxViewService.update(paTaskItemWxView);
        return ResultGenerator.genSuccessResult(paTaskItemWxView);
    }

    @PutMapping("/update")
    public Result update(PaTaskItemWxView paTaskItemWxView) {
        paTaskItemWxViewService.update(paTaskItemWxView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaTaskItemWxView paTaskItemWxView = paTaskItemWxViewService.findById(unid);
        return ResultGenerator.genSuccessResult(paTaskItemWxView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String patrolPointUnid, @RequestParam(required = false) String statusName) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaTaskItemWxView> list = null;
        Condition condition = new Condition(PaTaskItemWxView.class);
        Example.Criteria cr = condition.createCriteria();
        if (statusName != null && statusName != "") {
            cr.andCondition("status_name='" + statusName + "'");
        }
        if (patrolPointUnid != null && patrolPointUnid != "") {
            cr.andCondition("patrol_point_unid='" + patrolPointUnid + "'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paTaskItemWxViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
