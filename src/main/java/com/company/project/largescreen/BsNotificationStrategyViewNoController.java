package com.company.project.largescreen;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsNotificationStrategyViewNo;
import com.company.project.service.BsNotificationStrategyViewNoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import com.company.project.configurer.DomainedResource;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/15.
 */
@RestController
@RequestMapping("/strategyviewno")
public class BsNotificationStrategyViewNoController extends DomainedResource {
    @Resource
    private BsNotificationStrategyViewNoService bsNotificationStrategyViewNoService;

    @PostMapping("/add")
    public Result add(BsNotificationStrategyViewNo bsNotificationStrategyViewNo) {
        bsNotificationStrategyViewNoService.save(bsNotificationStrategyViewNo);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        BsNotificationStrategyViewNo bsNotificationStrategyViewNo = bsNotificationStrategyViewNoService.findById(unid);
        bsNotificationStrategyViewNo.setFlagDel(true);
        bsNotificationStrategyViewNoService.update(bsNotificationStrategyViewNo);
        return ResultGenerator.genSuccessResult(bsNotificationStrategyViewNo);
    }

    @PutMapping("/update")
    public Result update(BsNotificationStrategyViewNo bsNotificationStrategyViewNo) {
        bsNotificationStrategyViewNoService.update(bsNotificationStrategyViewNo);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        BsNotificationStrategyViewNo bsNotificationStrategyViewNo = bsNotificationStrategyViewNoService.findById(unid);
        return ResultGenerator.genSuccessResult(bsNotificationStrategyViewNo);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(defaultValue = "20") Integer size, @RequestParam(required = false) String name) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<BsNotificationStrategyViewNo> list = null;
        Condition condition = new Condition(BsNotificationStrategyViewNo.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("NAME like'%" + name + "%'");
        }
        list = bsNotificationStrategyViewNoService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
