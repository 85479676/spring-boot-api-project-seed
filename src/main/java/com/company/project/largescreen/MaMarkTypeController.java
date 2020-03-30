package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.MaMarkType;
import com.company.project.service.MaMarkTypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/19.
 */
@RestController
@RequestMapping("/mamarktype")
public class MaMarkTypeController extends DomainedResource {
    @Resource
    private MaMarkTypeService maMarkTypeService;

    @PostMapping("/add")
    public Result add(MaMarkType maMarkType) {
        maMarkTypeService.save(maMarkType);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        MaMarkType maMarkType = maMarkTypeService.findById(unid);
//        maMarkType.setFlagDel(true);
        maMarkTypeService.update(maMarkType);
        return ResultGenerator.genSuccessResult(maMarkType);
    }

    @PutMapping("/update")
    public Result update(MaMarkType maMarkType) {
        maMarkTypeService.update(maMarkType);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        MaMarkType maMarkType = maMarkTypeService.findById(unid);
        return ResultGenerator.genSuccessResult(maMarkType);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size, @RequestParam(required = false) String type) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<MaMarkType> list = null;
        Condition condition = new Condition(MaMarkType.class);
        Example.Criteria cr = condition.createCriteria();
        if (type != null && type != "") {
            cr.andCondition("type='" + type + "'");
        }

        list = maMarkTypeService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
