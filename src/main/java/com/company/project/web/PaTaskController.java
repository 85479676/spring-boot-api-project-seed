package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaTask;
import com.company.project.model.PaTaskView;
import com.company.project.service.PaTaskService;
import com.company.project.service.PaTaskViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/09.
 */
@RestController
@RequestMapping("/patask")
public class PaTaskController extends DomainedResource {
    @Resource
    private PaTaskService paTaskService;

    @Resource
    private PaTaskViewService paTaskViewService;


    @PostMapping("/add")
    public Result add(PaTask paTask) {
        paTaskService.save(paTask);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaTask paTask = paTaskService.findById(unid);
        paTask.setFlagDel(true);
        paTaskService.update(paTask);
        return ResultGenerator.genSuccessResult(paTask);
    }

    @PutMapping("/update")
    public Result update(PaTask paTask) {
        paTaskService.update(paTask);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaTask paTask = paTaskService.findById(unid);
        return ResultGenerator.genSuccessResult(paTask);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String name, @RequestParam(required = false) String taskDate) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaTaskView> list = null;
        Condition condition = new Condition(PaTaskView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        if (taskDate != null && taskDate != "") {
            cr.andCondition("task_date ='" + taskDate + "'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paTaskViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
