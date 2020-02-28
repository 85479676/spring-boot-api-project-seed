package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogTupleSensorView;
import com.company.project.model.MdModelView;
import com.company.project.service.LogTupleSensorViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/20.
 * 实时数据
 */
@RestController
@RequestMapping("/tuplesensor")
public class LogTupleSensorViewController {
    @Resource
    private LogTupleSensorViewService logTupleSensorViewService;

    @PostMapping("/add")
    public Result add(LogTupleSensorView logTupleSensorView) {
        logTupleSensorViewService.save(logTupleSensorView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        logTupleSensorViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LogTupleSensorView logTupleSensorView) {
        logTupleSensorViewService.update(logTupleSensorView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogTupleSensorView logTupleSensorView = logTupleSensorViewService.findById(unid);
//        Condition condition = new Condition(MdModelView.class);
//        condition.createCriteria().andCondition("FLAG_DEL=0");
//
//        list = logTupleSensorViewService.findById(unid);
        return ResultGenerator.genSuccessResult(logTupleSensorView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size, @RequestParam(required = false) String idHost) {
        PageHelper.startPage(page, size);
        List<LogTupleSensorView> list = null;
        Condition condition = new Condition(LogTupleSensorView.class);
//        if (unidEntity != null) {
//            condition.createCriteria().andCondition("UNID_ENTITY=+unidEntity").andCondition("FLAG_DEL=0");
//        }
        if (idHost != null) {
            condition.createCriteria().andCondition("ID_HOST ='" + idHost + "'");
        }
        list = logTupleSensorViewService.findByCondition(condition);

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
