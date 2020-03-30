package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmTodoPatrol;
import com.company.project.model.FmTodoPatrolView;
import com.company.project.model.FmTodoPatrols;
import com.company.project.service.FmTodoPatrolService;
import com.company.project.service.FmTodoPatrolViewService;
import com.company.project.util.DateHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.company.project.util.Empty.isEmpty;

/**
 * Created by CodeGenerator on 2020/03/19.
 */
@RestController
@RequestMapping("/todoPatrol")
public class FmTodoPatrolController extends DomainedResource {
    @Resource
    private FmTodoPatrolService fmTodoPatrolService;


    @Resource
    private FmTodoPatrolViewService fmTodoPatrolViewService;

    @PostMapping("/add")
    public Result add(FmTodoPatrol fmTodoPatrol) {
        fmTodoPatrolService.save(fmTodoPatrol);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        FmTodoPatrol fmTodoPatrol = fmTodoPatrolService.findById(unid);
        fmTodoPatrol.setFlagDel(true);
        fmTodoPatrolService.update(fmTodoPatrol);
        return ResultGenerator.genSuccessResult(fmTodoPatrol);
    }

    @PutMapping("/update")
    public Result update(FmTodoPatrol fmTodoPatrol) {
        fmTodoPatrolService.update(fmTodoPatrol);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmTodoPatrol fmTodoPatrol = fmTodoPatrolService.findById(unid);
        return ResultGenerator.genSuccessResult(fmTodoPatrol);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size, @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmTodoPatrolView> list = null;
        Condition condition = new Condition(FmTodoPatrolView.class);
        Example.Criteria cr = condition.createCriteria();
        if (datimeFrom != null && datimeFrom != "" && datimeTo != null && datimeTo != "") {
            cr.andCondition("DATIME_SYS BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo + "'");
        }
        list = fmTodoPatrolViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }

    @GetMapping("/s/list")
    public Result listTodo(@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size, @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo) {
        PageHelper.startPage(page, size);
        if (isEmpty(datimeFrom)) {
            datimeFrom = DateHelper.getDateYYYY_MM_DD_MIN();
        }
        if (isEmpty(datimeTo)) {
            datimeTo = DateHelper.getDateYYYY_MM_DD_MAX();
        }
//        datimeTo = DateHelper.getDateYYYY_MM_DD_MAX();
        List<FmTodoPatrols> list = fmTodoPatrolService.getTodoPatrol(domainUnid, datimeFrom, datimeTo);
        if (list.size() > 0) {
            for (FmTodoPatrols patrol : list
            ) {

                patrol.setAmount(patrol.getAiid());
                Boolean done = false;
                if (patrol.getFlagDone().equals(false)) {
                    patrol.setKey("未完成");
                } else {
                    patrol.setKey("已完成");
                }
            }
        } else {
            for (FmTodoPatrols patrols : list
            ) {
                patrols.setAmount(0);
                if (patrols.getFlagDone().equals(false)) {
                    patrols.setKey("未完成");
                } else {
                    patrols.setKey("已完成");
                }
            }
        }

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


}
