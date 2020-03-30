package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PmPaTaskItemView;
import com.company.project.service.PmPaTaskItemViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 巡检任务
 * Created by CodeGenerator on 2020/03/09.
 */
@RestController
@RequestMapping("/pmpataskitemview")
public class PmPaTaskItemViewController extends DomainedResource {
    @Resource
    private PmPaTaskItemViewService pmPaTaskItemViewService;

    @PostMapping("/add")
    public Result add(PmPaTaskItemView pmPaTaskItemView) {
        pmPaTaskItemViewService.save(pmPaTaskItemView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PmPaTaskItemView pmPaTaskItemView = pmPaTaskItemViewService.findById(unid);
        pmPaTaskItemView.setFlagDel(true);
        pmPaTaskItemViewService.update(pmPaTaskItemView);
        return ResultGenerator.genSuccessResult(pmPaTaskItemView);
    }

    @PutMapping("/update")
    public Result update(PmPaTaskItemView pmPaTaskItemView) {
        pmPaTaskItemViewService.update(pmPaTaskItemView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PmPaTaskItemView pmPaTaskItemView = pmPaTaskItemViewService.findById(unid);
        return ResultGenerator.genSuccessResult(pmPaTaskItemView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String name, @RequestParam(required = false) String taskDate) {
        String temp = this.tokenValue(request, domainUnid);
//        taskDate = DateHelper.getDateYYYY_MM_DD_MIN();
//        taskDate=DateHelper.getDateYYYY_MM_DD();
        PageHelper.startPage(page, size);
        List<PmPaTaskItemView> list = null;
        Condition condition = new Condition(PmPaTaskItemView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        if (taskDate != null&&taskDate!="") {
            cr.andCondition("task_date ='" + taskDate + "'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = pmPaTaskItemViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }

}

