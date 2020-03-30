package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MdGrid;
import com.company.project.service.MdGridService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/05.
 */
@RestController
@RequestMapping("/grid")
public class MdGridController extends DomainedResource {
    @Resource
    private MdGridService mdGridService;

    @PostMapping("/add")
    public Result add(MdGrid mdGrid) {
        mdGridService.save(mdGrid);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        MdGrid mdGrid = mdGridService.findById(unid);
        mdGrid.setFlagDel(true);
        mdGridService.update(mdGrid);
        return ResultGenerator.genSuccessResult(mdGrid);
    }

    @PutMapping("/update")
    public Result update(MdGrid mdGrid) {
        mdGridService.update(mdGrid);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detailKey(@PathVariable String unid) {
        MdGrid mdGrid = mdGridService.selectGridKey(unid);
        return ResultGenerator.genSuccessResult(mdGrid);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size, @RequestParam(required = false) String typeIds) {
        PageHelper.startPage(page, size);
        List<MdGrid> list = null;
        Condition condition = new Condition(MdGrid.class);
        Example.Criteria cr = condition.createCriteria();
        if (typeIds != null) {
            cr.andCondition("find_in_set (ID_TYPE,'" + typeIds + "')");
        }
        cr.andCondition("FLAG_DEL=0");
        condition.orderBy("aiid");
        list = mdGridService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }


}
