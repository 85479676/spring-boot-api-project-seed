package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.AnaSchemaProfileView;
import com.company.project.service.AnaSchemaProfileViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/22.
 */
@RestController
@RequestMapping("/schemaprofile")
public class AnaSchemaProfileViewController extends DomainedResource {
    @Resource
    private AnaSchemaProfileViewService anaSchemaProfileViewService;

    @PostMapping("/add")
    public Result add(AnaSchemaProfileView anaSchemaProfileView) {
        anaSchemaProfileViewService.save(anaSchemaProfileView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        anaSchemaProfileViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(AnaSchemaProfileView anaSchemaProfileView) {
        anaSchemaProfileViewService.update(anaSchemaProfileView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        AnaSchemaProfileView anaSchemaProfileView = anaSchemaProfileViewService.findById(unid);
        return ResultGenerator.genSuccessResult(anaSchemaProfileView);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String datimeFrom,
                       @RequestParam(required = false) String datimeTo, HttpServletRequest request,@RequestParam(required = false)String domainUnid) {
        String temp = this.tokenValue(request,domainUnid);
        PageHelper.startPage(page, size);
        List<AnaSchemaProfileView> list = null;
        Condition condition = new Condition(AnaSchemaProfileView.class);
        Example.Criteria cr = condition.createCriteria();
        if (datimeFrom != null) {
            cr.andCondition("DATIME_SYS BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo).andCondition("'");
        }
        cr.andCondition(temp);
        list = anaSchemaProfileViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
