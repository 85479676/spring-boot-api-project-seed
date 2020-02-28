package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MdModel;
import com.company.project.model.MdType;
import com.company.project.service.MdModelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * 设备型号
 * 增删改
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/model")
public class MdModelController {
    @Resource
    private MdModelService mdModelService;

    @PostMapping("/add")
    public Result add( MdModel mdModel) {
        mdModelService.save(mdModel);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        MdModel mdModel = mdModelService.findById(unid);
        mdModel.setFlagDel(true);
        mdModelService.update(mdModel);
//        mdModelService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(MdModel mdModel) {
        mdModelService.update(mdModel);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        MdModel mdModel = mdModelService.findById(unid);
        return ResultGenerator.genSuccessResult(mdModel);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size) {
        PageHelper.startPage(page, size);
        List<MdModel> list = null;
        Condition condition = new Condition(MdModel.class);

        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = mdModelService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
