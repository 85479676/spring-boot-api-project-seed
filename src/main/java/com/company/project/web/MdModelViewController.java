package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MdModelView;
import com.company.project.model.SysMenuView;
import com.company.project.service.MdModelViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
 * 设备型号
 * Created by CodeGenerator on 2020/02/18.
 */
@RestController
@RequestMapping("/modelview")
public class MdModelViewController {
    @Resource
    private MdModelViewService mdModelViewService;

    @PostMapping("/add")
    public Result add(MdModelView mdModelView) {
        mdModelViewService.save(mdModelView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        mdModelViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(MdModelView mdModelView) {
        mdModelViewService.update(mdModelView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        MdModelView mdModelView = mdModelViewService.findById(unid);
        return ResultGenerator.genSuccessResult(mdModelView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name, @RequestParam(required = false) String idType) {
        PageHelper.startPage(page, size);
        List<MdModelView> list = null;
        Condition condition = new Condition(MdModelView.class);
        if (name != null) {
            condition.createCriteria().andCondition("NAME like'%" + name + "%'").andCondition("FLAG_DEL=0");
        }
        if (idType != null) {
            condition.createCriteria().andCondition("ID_TYPE like'%" + idType + "%'").andCondition("FLAG_DEL=0");
        }
        condition.createCriteria().andCondition("FLAG_DEL=0");
        list = mdModelViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
