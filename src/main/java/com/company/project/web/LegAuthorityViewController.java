package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegAuthorityView;
import com.company.project.service.LegAuthorityViewService;
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
 * 权限的查询
 */
@RestController
@RequestMapping("/authorityview")
public class LegAuthorityViewController extends DomainedResource {
    @Resource
    private LegAuthorityViewService legAuthorityViewService;

    @PostMapping("/add")
    public Result add(@RequestBody LegAuthorityView legAuthorityView) {
        legAuthorityViewService.save(legAuthorityView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        legAuthorityViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegAuthorityView legAuthorityView) {
        legAuthorityViewService.update(legAuthorityView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegAuthorityView legAuthorityView = legAuthorityViewService.findById(unid);
        return ResultGenerator.genSuccessResult(legAuthorityView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String name, @RequestParam(required = false) String domainName) {
        String temp = this.tokenValue(request,domainUnid);
        PageHelper.startPage(page, size);
        List<LegAuthorityView> list = null;
        Condition condition = new Condition(LegAuthorityView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("NAME like'%" + name + "%'");
        }

        if (domainName != null) {
            cr.andCondition("DOMAIN_NAME like'%" + domainName + "%'");
        }
        cr.andCondition("FLAG_DEL=0");
        cr.andCondition(temp);
        list = legAuthorityViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
