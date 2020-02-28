package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmFacilityView;
import com.company.project.model.SysMenuView;
import com.company.project.service.FmFacilityViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * 设备接口
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/facilityview")
public class FmFacilityViewController {
    @Resource
    private FmFacilityViewService fmFacilityViewService;

    @PostMapping("/add")
    public Result add(FmFacilityView fmFacilityView) {
        fmFacilityViewService.save(fmFacilityView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        fmFacilityViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(FmFacilityView fmFacilityView) {
        fmFacilityViewService.update(fmFacilityView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmFacilityView fmFacilityView = fmFacilityViewService.findById(unid);
        return ResultGenerator.genSuccessResult(fmFacilityView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name, @RequestParam(required = false) String idType) {
        PageHelper.startPage(page, size);
        List<FmFacilityView> list = null;
        Condition condition = new Condition(FmFacilityView.class);
        if (name != null) {
            condition.createCriteria().andCondition("NAME like'%" + name + "%'").andCondition("FLAG_DEL=0");
        }
        if (idType != null) {
            condition.createCriteria().andCondition("ID_TYPE like'%" + idType + "%'").andCondition("FLAG_DEL=0");
        }
        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = fmFacilityViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
