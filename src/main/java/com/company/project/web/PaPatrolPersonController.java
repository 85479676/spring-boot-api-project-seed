package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPerson;
import com.company.project.model.PaPatrolPersonView;
import com.company.project.service.PaPatrolPersonService;
import com.company.project.service.PaPatrolPersonViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 巡检人员列表
 * Created by CodeGenerator on 2020/03/09.
 */
@RestController
@RequestMapping("/papatrolperson")
public class PaPatrolPersonController extends DomainedResource {
    @Resource
    private PaPatrolPersonService paPatrolPersonService;

    @Resource
    private PaPatrolPersonViewService paPatrolPersonViewService;

    @PostMapping("/add")
    public Result add(PaPatrolPerson paPatrolPerson) {
        paPatrolPersonService.save(paPatrolPerson);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaPatrolPerson paPatrolPerson = paPatrolPersonService.findById(unid);
        paPatrolPerson.setFlagDel(true);
        paPatrolPersonService.update(paPatrolPerson);
        return ResultGenerator.genSuccessResult(paPatrolPerson);
    }

    @PutMapping("/update")
    public Result update(PaPatrolPerson paPatrolPerson) {
        paPatrolPersonService.update(paPatrolPerson);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaPatrolPerson paPatrolPerson = paPatrolPersonService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPerson);
    }


    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String nameLogin) {
        String temp = this.tokenValue(request,domainUnid);
        PageHelper.startPage(page, size);
        List<PaPatrolPersonView> list = null;
        Condition condition = new Condition(PaPatrolPersonView.class);
        Example.Criteria cr = condition.createCriteria();
        if (nameLogin != null) {
            cr.andCondition("NAME_LOGIN like'%" + nameLogin + "%'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paPatrolPersonViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }

//     @GetMapping("/list")
//     public Result list(HttpServletRequest request,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
//        String temp = this.tokenValue(request);
//         PageHelper.startPage(page, size);
//         List<PaPatrolPerson> list = null;
//         Condition condition = new Condition(PaPatrolPerson.class);
//         Example.Criteria cr= condition.createCriteria();
//         list = paPatrolPersonService.findByCondition(condition);
//         PageInfo pageInfo = new PageInfo(list);
//         return ResultGenerator.genSuccessResult(pageInfo);
//
//     }
}
