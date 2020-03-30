package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegUserGroupDomainMapView;
import com.company.project.service.LegUserGroupDomainMapViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/25.
 * 用户组和分组的视图查询
 */
@RestController
@RequestMapping("/userdomainmapview")
public class LegUserGroupDomainMapViewController extends DomainedResource {
    @Resource
    private LegUserGroupDomainMapViewService legUserGroupDomainMapViewService;

    @PostMapping("/add")
    public Result add(LegUserGroupDomainMapView legUserGroupDomainMapView) {
        legUserGroupDomainMapViewService.save(legUserGroupDomainMapView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        legUserGroupDomainMapViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegUserGroupDomainMapView legUserGroupDomainMapView) {
        legUserGroupDomainMapViewService.update(legUserGroupDomainMapView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegUserGroupDomainMapView legUserGroupDomainMapView = legUserGroupDomainMapViewService.findById(unid);
        return ResultGenerator.genSuccessResult(legUserGroupDomainMapView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size, @RequestParam(required = false) String unid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<LegUserGroupDomainMapView> list = null;
        Condition condition = new Condition(LegUserGroupDomainMapView.class);
        Example.Criteria cr = condition.createCriteria();
        if (unid != null) {
            cr.andCondition("USER_GROUP_UNID='" + unid + "'");
        }
        cr.andCondition(temp);
        list = legUserGroupDomainMapViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
