package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PmProtocol;
import com.company.project.model.PmProtocolItem;
import com.company.project.service.PmProtocolService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/02.
 */
@RestController
@RequestMapping("/pmprotocol")
public class PmProtocolController {
    @Resource
    private PmProtocolService pmProtocolService;

    @PostMapping("/add")
    public Result add(PmProtocol pmProtocol) {
        pmProtocolService.save(pmProtocol);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PmProtocol pmProtocol = pmProtocolService.findById(unid);
        pmProtocol.setFlagDel(true);
        pmProtocolService.update(pmProtocol);
        return ResultGenerator.genSuccessResult(pmProtocol);
    }

    @PutMapping("/update")
    public Result update(PmProtocol pmProtocol) {
        pmProtocolService.update(pmProtocol);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PmProtocol pmProtocol = pmProtocolService.findById(unid);
        return ResultGenerator.genSuccessResult(pmProtocol);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name) {
        PageHelper.startPage(page, size);
        List<PmProtocol> list = null;
        Condition condition = new Condition(PmProtocol.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        cr.andCondition("flag_del=0");
        list = pmProtocolService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
