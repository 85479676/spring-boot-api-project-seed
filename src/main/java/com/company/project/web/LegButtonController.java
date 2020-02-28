package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegButton;
import com.company.project.service.LegButtonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 按钮接口
 * 增删改
 *  王永杰
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/button")
public class LegButtonController {
    @Resource
    private LegButtonService legButtonService;

    @PostMapping("/add")
    public Result add( LegButton legButton) {
        legButtonService.save(legButton);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LegButton legButton = legButtonService.findById(unid);
        legButton.setFlagDel(true);
        legButtonService.update(legButton);
        return ResultGenerator.genSuccessResult(legButton);
    }

    @PutMapping("/update")
    public Result update(LegButton legButton) {
        legButtonService.update(legButton);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegButton legButton = legButtonService.findById(unid);
        return ResultGenerator.genSuccessResult(legButton);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size) {
        PageHelper.startPage(page, size);
        List<LegButton> list = legButtonService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
