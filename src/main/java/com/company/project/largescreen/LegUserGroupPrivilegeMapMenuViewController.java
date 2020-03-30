package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegUserGroupPrivilegeMapMenuView;
import com.company.project.service.LegUserGroupPrivilegeMapMenuViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/25.
 */
@RestController
@RequestMapping("/privilegeMenuView")
public class LegUserGroupPrivilegeMapMenuViewController extends DomainedResource {
    @Resource
    private LegUserGroupPrivilegeMapMenuViewService legUserGroupPrivilegeMapMenuViewService;

    @PostMapping("/add")
    public Result add(LegUserGroupPrivilegeMapMenuView legUserGroupPrivilegeMapMenuView) {
        legUserGroupPrivilegeMapMenuViewService.save(legUserGroupPrivilegeMapMenuView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        LegUserGroupPrivilegeMapMenuView legUserGroupPrivilegeMapMenuView = legUserGroupPrivilegeMapMenuViewService.findById(unid);
        legUserGroupPrivilegeMapMenuView.setFlagDel(true);
        legUserGroupPrivilegeMapMenuViewService.update(legUserGroupPrivilegeMapMenuView);
        return ResultGenerator.genSuccessResult(legUserGroupPrivilegeMapMenuView);
    }

    @PutMapping("/update")
    public Result update(LegUserGroupPrivilegeMapMenuView legUserGroupPrivilegeMapMenuView) {
        legUserGroupPrivilegeMapMenuViewService.update(legUserGroupPrivilegeMapMenuView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegUserGroupPrivilegeMapMenuView legUserGroupPrivilegeMapMenuView = legUserGroupPrivilegeMapMenuViewService.findById(unid);
        return ResultGenerator.genSuccessResult(legUserGroupPrivilegeMapMenuView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size, @RequestParam(required = false) String openUnid) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<LegUserGroupPrivilegeMapMenuView> list = null;
        Condition condition = new Condition(LegUserGroupPrivilegeMapMenuView.class);
        Example.Criteria cr = condition.createCriteria();
        if (openUnid != null && openUnid != "") {
            cr.andCondition("OPEN_UNID='" + openUnid + "'");
        }

        cr.andCondition("FLAG_DEL=0");
        condition.orderBy("inx").asc();
        list = legUserGroupPrivilegeMapMenuViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
