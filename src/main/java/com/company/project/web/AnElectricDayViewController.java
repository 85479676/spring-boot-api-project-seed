package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AnElectricDayView;
import com.company.project.service.AnElectricDayViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/22.
 */
@RestController
@RequestMapping("/electricday")
public class AnElectricDayViewController {
    @Resource
    private AnElectricDayViewService anElectricDayViewService;

    @PostMapping("/add")
    public Result add(AnElectricDayView anElectricDayView) {
        anElectricDayViewService.save(anElectricDayView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        anElectricDayViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(AnElectricDayView anElectricDayView) {
        anElectricDayViewService.update(anElectricDayView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        AnElectricDayView anElectricDayView = anElectricDayViewService.findById(unid);
        return ResultGenerator.genSuccessResult(anElectricDayView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo) {
        PageHelper.startPage(page, size);
        List<AnElectricDayView> list = null;
        Condition condition = new Condition(AnElectricDayView.class);
        if (datimeFrom != null) {
            condition.createCriteria().andCondition("SYSTEM_DATIME BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo).andCondition("'");
        }
        list = anElectricDayViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
