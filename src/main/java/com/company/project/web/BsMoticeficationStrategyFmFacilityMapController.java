package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BsMoticeficationStrategyFmFacilityMap;
import com.company.project.service.BsMoticeficationStrategyFmFacilityMapService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 通知策略
 * Created by CodeGenerator on 2020/02/28.
 */
@RestController
@RequestMapping("/bsmoticeficationfacility")
public class BsMoticeficationStrategyFmFacilityMapController {
    @Resource
    private BsMoticeficationStrategyFmFacilityMapService bsMoticeficationStrategyFmFacilityMapService;

    @PostMapping("/add")
    public Result add(BsMoticeficationStrategyFmFacilityMap bsMoticeficationStrategyFmFacilityMap) {
        bsMoticeficationStrategyFmFacilityMapService.save(bsMoticeficationStrategyFmFacilityMap);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/{unid}")
    public Result delete(@PathVariable String unid, @RequestParam(required = false) String fmfunid) {
        bsMoticeficationStrategyFmFacilityMapService.deleteById(unid);
        String[] menulist = fmfunid.split(",");
        for (String menu : menulist
        ) {
            BsMoticeficationStrategyFmFacilityMap menuMap = new BsMoticeficationStrategyFmFacilityMap();
            menuMap.setNsUnid(unid);
            menuMap.setFmfUnid(menu);
            bsMoticeficationStrategyFmFacilityMapService.save(menuMap);
        }
        return ResultGenerator.genSuccessResult();

    }

    @PutMapping("/update")
    public Result update(BsMoticeficationStrategyFmFacilityMap bsMoticeficationStrategyFmFacilityMap) {
        bsMoticeficationStrategyFmFacilityMapService.update(bsMoticeficationStrategyFmFacilityMap);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        BsMoticeficationStrategyFmFacilityMap bsMoticeficationStrategyFmFacilityMap = bsMoticeficationStrategyFmFacilityMapService.findById(unid);
        return ResultGenerator.genSuccessResult(bsMoticeficationStrategyFmFacilityMap);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BsMoticeficationStrategyFmFacilityMap> list = bsMoticeficationStrategyFmFacilityMapService.findAll();

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
