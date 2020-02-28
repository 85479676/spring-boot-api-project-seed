package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogEventView;
import com.company.project.model.MdModelView;
import com.company.project.service.LogEventViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/20.
 * 报警历史视图查询
 */
@RestController
@RequestMapping("/eventview")
public class LogEventViewController {
    @Resource
    private LogEventViewService logEventViewService;

    @PostMapping("/add")
    public Result add(LogEventView logEventView) {
        logEventViewService.save(logEventView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        logEventViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LogEventView logEventView) {
        logEventViewService.update(logEventView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogEventView logEventView = logEventViewService.findById(unid);
        return ResultGenerator.genSuccessResult(logEventView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size, @RequestParam(required = false) String unidEntity) {
        PageHelper.startPage(page, size);
        List<LogEventView> list = null;
        Condition condition = new Condition(LogEventView.class);
//        if (unidEntity != null) {
//            condition.createCriteria().andCondition("UNID_ENTITY=+unidEntity").andCondition("FLAG_DEL=0");
//        }
        if (unidEntity != null) {
            condition.createCriteria().andCondition("UNID_ENTITY ='" + unidEntity + "'").andCondition("FLAG_DEL=0");
        }

        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = logEventViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
