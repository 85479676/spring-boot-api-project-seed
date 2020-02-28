package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmHost;
import com.company.project.service.FmHostService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/26.
 * 主机管理
 */
@RestController
@RequestMapping("/fmhost")
public class FmHostController {
    @Resource
    private FmHostService fmHostService;

    @PostMapping("/add")
    public Result add(FmHost fmHost) {
        fmHostService.save(fmHost);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        FmHost fmHost = fmHostService.findById(unid);
        fmHost.setFlagDel(true);
        fmHostService.update(fmHost);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(FmHost fmHost) {
        fmHostService.update(fmHost);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmHost fmHost = fmHostService.findById(unid);
        return ResultGenerator.genSuccessResult(fmHost);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<FmHost> list = fmHostService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
