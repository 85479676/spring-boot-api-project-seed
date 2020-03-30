package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PmProtocolItem;
import com.company.project.service.PmProtocolItemService;
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
 * Created by CodeGenerator on 2020/03/03.
 */
@RestController
@RequestMapping("/pmprotocolitem")
public class PmProtocolItemController extends DomainedResource {
    @Resource
    private PmProtocolItemService pmProtocolItemService;

    @PostMapping("/add")
    public Result add(PmProtocolItem pmProtocolItem) {
        pmProtocolItemService.save(pmProtocolItem);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PmProtocolItem pmProtocolItem = pmProtocolItemService.findById(unid);
        pmProtocolItem.setFlagDel(true);
        pmProtocolItemService.update(pmProtocolItem);
        return ResultGenerator.genSuccessResult(pmProtocolItem);
    }

    @PutMapping("/update")
    public Result update(PmProtocolItem pmProtocolItem) {
        pmProtocolItemService.update(pmProtocolItem);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PmProtocolItem pmProtocolItem = pmProtocolItemService.findById(unid);
        return ResultGenerator.genSuccessResult(pmProtocolItem);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size) {
        PageHelper.startPage(page, size);
        List<PmProtocolItem> list = null;
        Condition condition = new Condition(PmProtocolItem.class);
        Example.Criteria cr = condition.createCriteria();
        cr.andCondition("flag_del=0");
        list = pmProtocolItemService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
