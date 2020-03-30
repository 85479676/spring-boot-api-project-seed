package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PmProtocolOrder;
import com.company.project.model.PmProtocolOrderView;
import com.company.project.service.PmProtocolOrderService;
import com.company.project.service.PmProtocolOrderViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import com.company.project.configurer.DomainedResource;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/03.
 */
@RestController
@RequestMapping("/pmprotocolorder")
public class PmProtocolOrderController extends DomainedResource {
    @Resource
    private PmProtocolOrderService pmProtocolOrderService;

    @Resource
    private PmProtocolOrderViewService pmProtocolOrderViewService;


    @PostMapping("/add")
    public Result add(PmProtocolOrder pmProtocolOrder) {
        pmProtocolOrderService.save(pmProtocolOrder);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PmProtocolOrder pmProtocolOrder = pmProtocolOrderService.findById(unid);
        pmProtocolOrder.setFlagDel(true);
        pmProtocolOrderService.update(pmProtocolOrder);
        return ResultGenerator.genSuccessResult(pmProtocolOrder);
    }

    @PutMapping("/update")
    public Result update(PmProtocolOrder pmProtocolOrder) {
        pmProtocolOrderService.update(pmProtocolOrder);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PmProtocolOrder pmProtocolOrder = pmProtocolOrderService.findById(unid);
        return ResultGenerator.genSuccessResult(pmProtocolOrder);
    }


    @GetMapping("/list")
    public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size, @RequestParam(required = false) String name) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PmProtocolOrderView> list = null;
        Condition condition = new Condition(PmProtocolOrderView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        cr.andCondition("flag_del=0");
        list = pmProtocolOrderViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }


}
