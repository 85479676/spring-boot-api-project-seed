package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.OauAccessToken;
import com.company.project.service.OauAccessTokenService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/02/27.
*/
@RestController
@RequestMapping("/oau/access/token")
public class OauAccessTokenController {
    @Resource
    private OauAccessTokenService oauAccessTokenService;

    @PostMapping("/add")
    public Result add(OauAccessToken oauAccessToken) {
        oauAccessTokenService.save(oauAccessToken);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        oauAccessTokenService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(OauAccessToken oauAccessToken) {
        oauAccessTokenService.update(oauAccessToken);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        OauAccessToken oauAccessToken = oauAccessTokenService.findById(unid);
        return ResultGenerator.genSuccessResult(oauAccessToken);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<OauAccessToken> list = oauAccessTokenService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
