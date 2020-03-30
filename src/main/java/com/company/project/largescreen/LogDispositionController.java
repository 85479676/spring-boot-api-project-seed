package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogAlarmCurrent;
import com.company.project.model.LogDisposition;
import com.company.project.model.LogDispositionUser;
import com.company.project.service.LogAlarmCurrentService;
import com.company.project.service.LogDispositionService;
import com.company.project.service.LogDispositionUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 报警信息描述
 * Created by CodeGenerator on 2020/03/17.
 */
@RestController
@RequestMapping("/logdisposition")
public class LogDispositionController extends DomainedResource {
    @Resource
    private LogDispositionService logDispositionService;
    @Resource
    private LogDispositionUserService logDispositionUserService;
    @Resource
    private LogAlarmCurrentService logAlarmCurrentService;


    @PostMapping("/add")
    public Result add(LogDisposition logDisposition) {
        logDispositionService.save(logDisposition);
        /**
         * 缺少个设备ID查询接口
         */
        LogAlarmCurrent current = logAlarmCurrentService.findById(logDisposition.getUnid());
        if (current!= null) {
            current.setStatus(true);
            logAlarmCurrentService.update(current);
        } else {
            return ResultGenerator.genSuccessResult("没有这条数据，请重新输入");
        }
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LogDisposition logDisposition = logDispositionService.findById(unid);
        logDisposition.setFlagDel(true);
        logDispositionService.update(logDisposition);
        return ResultGenerator.genSuccessResult(logDisposition);
    }

    @PutMapping("/update")
    public Result update(LogDisposition logDisposition) {
        logDispositionService.update(logDisposition);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LogDisposition logDisposition = logDispositionService.findById(unid);
        return ResultGenerator.genSuccessResult(logDisposition);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size, @RequestParam(required = false) String unid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<LogDispositionUser> list = null;
        Condition condition = new Condition(LogDispositionUser.class);
        Example.Criteria cr = condition.createCriteria();
        if (unid != null && unid != "") {
            cr.andCondition("unid='" + unid + "'");
        }
        list = logDispositionUserService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
