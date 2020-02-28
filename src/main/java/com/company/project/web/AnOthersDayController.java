package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AnElectricDayView;
import com.company.project.model.AnOthersDay;
import com.company.project.service.AnOthersDayService;
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
@RequestMapping("/othersday")
public class AnOthersDayController {
    @Resource
    private AnOthersDayService anOthersDayService;

    @PostMapping("/add")
    public Result add(AnOthersDay anOthersDay) {
        anOthersDayService.save(anOthersDay);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        anOthersDayService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(AnOthersDay anOthersDay) {
        anOthersDayService.update(anOthersDay);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        AnOthersDay anOthersDay = anOthersDayService.findById(unid);
        return ResultGenerator.genSuccessResult(anOthersDay);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo) {
        PageHelper.startPage(page, size);
        List<AnOthersDay> list = null;
        Condition condition = new Condition(AnOthersDay.class);
        if (datimeFrom != null) {
            condition.createCriteria().andCondition("SYSTEM_DATIME BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo).andCondition("'");
        }
        list = anOthersDayService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
