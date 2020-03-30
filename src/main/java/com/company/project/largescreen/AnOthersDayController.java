package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AnOthersDay;
import com.company.project.service.AnOthersDayService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/25.
 */
@RestController
@RequestMapping("/othersDay")
public class AnOthersDayController extends DomainedResource {
    @Resource
    private AnOthersDayService anOthersDayService;

    @PostMapping("/add")
    public Result add(AnOthersDay anOthersDay) {
        anOthersDayService.save(anOthersDay);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        AnOthersDay anOthersDay = anOthersDayService.findById(unid);
//        anOthersDay.setFlagDel(true);
        anOthersDayService.update(anOthersDay);
        return ResultGenerator.genSuccessResult(anOthersDay);
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
    public Result list(@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size, @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo,
                       @RequestParam(required = false) String alarmCount, @RequestParam(required = false) String faultCount) {

        PageHelper.startPage(page, size);
        List<AnOthersDay> list = null;
        Condition condition = new Condition(AnOthersDay.class);
        Example.Criteria cr = condition.createCriteria();

        if (datimeFrom != null && datimeFrom != "" && datimeTo != null && datimeTo != "") {
            cr.andCondition("DATIME_TIME >='" + datimeFrom + "'").andCondition("DATIME_TIME <='" + datimeTo + "'");
        }
        if (alarmCount != null && alarmCount != "") {
            cr.andCondition("ALARM_COUNT='" + alarmCount + "'");
        }
        if (faultCount != null && alarmCount != "") {
            cr.andCondition("FAULT_COUNT='" + faultCount + "'");
        }
        list = anOthersDayService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
