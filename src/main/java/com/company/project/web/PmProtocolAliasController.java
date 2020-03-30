package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PmProtocol;
import com.company.project.model.PmProtocolAlias;
import com.company.project.service.PmProtocolAliasService;
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
@RequestMapping("/pmprotocolalias")
public class PmProtocolAliasController {
    @Resource
    private PmProtocolAliasService pmProtocolAliasService;

    @PostMapping("/add")
    public Result add(PmProtocolAlias pmProtocolAlias) {
        pmProtocolAliasService.save(pmProtocolAlias);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PmProtocolAlias pmProtocolAlias = pmProtocolAliasService.findById(unid);
        pmProtocolAlias.setFlagDel(true);
        pmProtocolAliasService.update(pmProtocolAlias);
        return ResultGenerator.genSuccessResult(pmProtocolAlias);
    }

    @PutMapping("/update")
    public Result update(PmProtocolAlias pmProtocolAlias) {
        pmProtocolAliasService.update(pmProtocolAlias);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PmProtocolAlias pmProtocolAlias = pmProtocolAliasService.findById(unid);
        return ResultGenerator.genSuccessResult(pmProtocolAlias);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name) {
        PageHelper.startPage(page, size);
        List<PmProtocolAlias> list = null;
        Condition condition = new Condition(PmProtocolAlias.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        cr.andCondition("flag_del=0");
        list = pmProtocolAliasService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
