package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegAuthority;
import com.company.project.service.LegAuthorityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/20.
 * 权限的增删改
 */
@RestController
@RequestMapping("/authority")
public class LegAuthorityController {
    @Resource
    private LegAuthorityService legAuthorityService;

    @PostMapping("/add")
    public Result add( LegAuthority legAuthority) {
        legAuthorityService.save(legAuthority);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LegAuthority legAuthority = legAuthorityService.findById(unid);
        legAuthority.setFlagDel(true);
        legAuthorityService.update(legAuthority);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegAuthority legAuthority) {
        legAuthorityService.update(legAuthority);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegAuthority legAuthority = legAuthorityService.findById(unid);
        return ResultGenerator.genSuccessResult(legAuthority);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<LegAuthority> list = legAuthorityService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
