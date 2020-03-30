package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaTaskItemViews;
import com.company.project.service.PaTaskItemViewsService;
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
@RequestMapping("/taskitemviews")
public class PaTaskItemViewsController extends DomainedResource {
    @Resource
    private PaTaskItemViewsService paTaskItemViewsService;

    @PostMapping("/add")
    public Result add(PaTaskItemViews paTaskItemViews) {
        paTaskItemViewsService.save(paTaskItemViews);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaTaskItemViews paTaskItemViews = paTaskItemViewsService.findById(unid);
        paTaskItemViews.setFlagDel(true);
        paTaskItemViewsService.update(paTaskItemViews);
        return ResultGenerator.genSuccessResult(paTaskItemViews);
    }

    @PutMapping("/update")
    public Result update(PaTaskItemViews paTaskItemViews) {
        paTaskItemViewsService.update(paTaskItemViews);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaTaskItemViews paTaskItemViews = paTaskItemViewsService.findById(unid);
        return ResultGenerator.genSuccessResult(paTaskItemViews);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String nameLogin, @RequestParam(required = false) String taskUnid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaTaskItemViews> list = null;
        Condition condition = new Condition(PaTaskItemViews.class);
        Example.Criteria cr = condition.createCriteria();
        if (nameLogin != null && nameLogin != "") {
            cr.andCondition("NAME_LOGIN like'%" + nameLogin + "%'");

        }
        if (taskUnid != null && taskUnid != "") {
            cr.andCondition("task_unid='" + taskUnid + "'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paTaskItemViewsService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
