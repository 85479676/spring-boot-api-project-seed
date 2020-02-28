package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AnElectricDayView;
import com.company.project.model.AnWaterDayView;
import com.company.project.service.AnWaterDayViewService;
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
@RequestMapping("/waterday")
public class AnWaterDayViewController {
    @Resource
    private AnWaterDayViewService anWaterDayViewService;

    @PostMapping("/add")
    public Result add(AnWaterDayView anWaterDayView) {
        anWaterDayViewService.save(anWaterDayView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        anWaterDayViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(AnWaterDayView anWaterDayView) {
        anWaterDayViewService.update(anWaterDayView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        AnWaterDayView anWaterDayView = anWaterDayViewService.findById(unid);
        return ResultGenerator.genSuccessResult(anWaterDayView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo) {
        PageHelper.startPage(page, size);
        List<AnWaterDayView> list = null;
        Condition condition = new Condition(AnWaterDayView.class);
        if (datimeFrom != null) {
            condition.createCriteria().andCondition("SYSTEM_DATIME BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo).andCondition("'");
        }
        list = anWaterDayViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
