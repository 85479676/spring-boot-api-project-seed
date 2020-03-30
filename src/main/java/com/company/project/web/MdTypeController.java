package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MdType;
import com.company.project.model.MdTypeView;
import com.company.project.service.MdTypeService;
import com.company.project.service.MdTypeViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/20.
 * 类型接口 增删改查
 */
@RestController
@RequestMapping("/type")
public class MdTypeController {
    @Resource
    private MdTypeService mdTypeService;

    @Resource
    private MdTypeViewService mdTypeViewService;

    @PostMapping("/add")
    public Result add(MdType mdType) {
        mdTypeService.save(mdType);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{aiid}")
    public Result delete(@PathVariable Integer aiid) {

        MdType mdType = mdTypeService.findByAiid(aiid);
        mdType.setFlagDel(true);
        mdTypeService.update(mdType);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(MdType mdType) {
        mdTypeService.update(mdType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{aiid}")
    public Result detail(@PathVariable Integer aiid) {
        MdType mdType = mdTypeService.findByAiid(aiid);
        return ResultGenerator.genSuccessResult(mdType);
    }

//    @GetMapping("/list")
//    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name,
//                       @RequestParam(required = false) String channel) {
//        PageHelper.startPage(page, size);
//        List<MdType> list = null;
//        Condition condition = new Condition(MdType.class);
//        Example.Criteria cr = condition.createCriteria();
//        if (name != null) {
//            cr.andCondition("NAME like'%" + name + "%'");
//        }
//        if (channel != null) {
//            cr.andCondition("CHANNEL like'%" + channel + "%'");
//        }
//        cr.andCondition("FLAG_DEL=0");
//        list = mdTypeService.findByCondition(condition);
//        PageInfo pageInfo = new PageInfo(list);
//        return ResultGenerator.genSuccessResult(pageInfo);
//    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size, @RequestParam(required = false) String name,
                       @RequestParam(required = false) String channel) {

        PageHelper.startPage(page, size);
        List<MdTypeView> list = null;
        Condition condition = new Condition(MdTypeView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("NAME like'%" + name + "%'");
        }
        if (channel != null) {
            cr.andCondition("CHANNEL like'%" + channel + "%'");
        }
        cr.andCondition("FLAG_DEL=0");
        list = mdTypeViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }


}
