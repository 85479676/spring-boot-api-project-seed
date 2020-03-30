package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaTaskItemPointView;
import com.company.project.service.PaTaskItemPointViewService;
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
@RequestMapping("/taskitempointview")
public class PaTaskItemPointViewController extends DomainedResource {
    @Resource
    private PaTaskItemPointViewService paTaskItemPointViewService;

    @PostMapping("/add")
    public Result add(PaTaskItemPointView paTaskItemPointView) {
        paTaskItemPointViewService.save(paTaskItemPointView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaTaskItemPointView paTaskItemPointView = paTaskItemPointViewService.findById(unid);
        paTaskItemPointView.setFlagDel(true);
        paTaskItemPointViewService.update(paTaskItemPointView);
        return ResultGenerator.genSuccessResult(paTaskItemPointView);
    }

    @PutMapping("/update")
    public Result update(PaTaskItemPointView paTaskItemPointView) {
        paTaskItemPointViewService.update(paTaskItemPointView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaTaskItemPointView paTaskItemPointView = paTaskItemPointViewService.findById(unid);
        return ResultGenerator.genSuccessResult(paTaskItemPointView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String stateName) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaTaskItemPointView> list = null;
        Condition condition = new Condition(PaTaskItemPointView.class);
        Example.Criteria cr = condition.createCriteria();
        if (stateName != null && stateName != "") {
            cr.andCondition("state_name='" + stateName + "'");
        }
        list = paTaskItemPointViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
