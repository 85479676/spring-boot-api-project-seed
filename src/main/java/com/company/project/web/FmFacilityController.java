package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmFacility;
import com.company.project.service.FmFacilityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

/**
 * 设备接口
 * 增删改
 * 王永杰
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/facility")
public class FmFacilityController {
//    @Resource
//    private JedisPool jedisPool;
    @Resource
    private FmFacilityService fmFacilityService;

    @PostMapping("/add")
    public Result add(FmFacility fmFacility) {
        fmFacilityService.save(fmFacility);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        FmFacility fmFacility = fmFacilityService.findById(unid);
        fmFacility.setFlagDel(true);
        fmFacilityService.update(fmFacility);
//        fmFacilityService.deleteById(unid);
        return ResultGenerator.genSuccessResult(fmFacility);
    }

    @PutMapping("/update")
    public Result update(FmFacility fmFacility) {
        fmFacilityService.update(fmFacility);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmFacility fmFacility = fmFacilityService.findById(unid);
        return ResultGenerator.genSuccessResult(fmFacility);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
//        Jedis jedis = jedisPool.getResource();


        List<FmFacility> list = fmFacilityService.findAll();
//        jedis.append("name", list.toString());
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
