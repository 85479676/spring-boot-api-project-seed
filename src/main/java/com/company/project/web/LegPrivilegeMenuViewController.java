package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegPrivilegeMenuView;
import com.company.project.model.LegPrivilegeView;
import com.company.project.service.LegPrivilegeMenuViewService;
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
 * 角色和菜单的查询
 */
@RestController
@RequestMapping("/privilegemenu")
public class LegPrivilegeMenuViewController extends DomainedResource {
    @Resource
    private LegPrivilegeMenuViewService legPrivilegeMenuViewService;

    @PostMapping("/add")
    public Result add(LegPrivilegeMenuView legPrivilegeMenuView) {
        legPrivilegeMenuViewService.save(legPrivilegeMenuView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        legPrivilegeMenuViewService.deleteById(unid);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(LegPrivilegeMenuView legPrivilegeMenuView) {
        legPrivilegeMenuViewService.update(legPrivilegeMenuView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        LegPrivilegeMenuView legPrivilegeMenuView = legPrivilegeMenuViewService.findById(unid);
        return ResultGenerator.genSuccessResult(legPrivilegeMenuView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue
            = "30") Integer size,
                       @RequestParam(required = false) String privilege, @RequestParam(required = false) String privilegeName,
                       @RequestParam(required = false) String menuName) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<LegPrivilegeMenuView> list = null;
        Condition condition = new Condition(LegPrivilegeView.class);
        Example.Criteria cr = condition.createCriteria();
        if (privilege != null) {
            cr.andCondition("PRIVILEGE_UNID='" + privilege + "'");
        }

//        if (privilege != null) {
//            condition.createCriteria().andCondition("find_in_set(PRIVILEGE_UNID,'").andCondition(privilege).andCondition("')");
//        }
        cr.andCondition(temp);
        list = legPrivilegeMenuViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
