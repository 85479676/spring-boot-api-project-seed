package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PmProtocolOrderView;
import com.company.project.service.PmProtocolOrderViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/09.
*/
@RestController
@RequestMapping("/pm/protocol/order/view")
public class PmProtocolOrderViewController extends DomainedResource{
     @Resource
     private PmProtocolOrderViewService pmProtocolOrderViewService;

     @PostMapping("/add")
     public Result add(PmProtocolOrderView pmProtocolOrderView) {
        pmProtocolOrderViewService.save(pmProtocolOrderView);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        PmProtocolOrderView pmProtocolOrderView = pmProtocolOrderViewService.findById(unid);
        pmProtocolOrderView.setFlagDel(true);
        pmProtocolOrderViewService.update(pmProtocolOrderView);
        return ResultGenerator.genSuccessResult(pmProtocolOrderView);
     }

     @PutMapping("/update")
     public Result update(PmProtocolOrderView pmProtocolOrderView) {
        pmProtocolOrderViewService.update(pmProtocolOrderView);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        PmProtocolOrderView pmProtocolOrderView = pmProtocolOrderViewService.findById(unid);
        return ResultGenerator.genSuccessResult(pmProtocolOrderView);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
         PageHelper.startPage(page, size);
         List<PmProtocolOrderView> list = null;
         Condition condition = new Condition(PmProtocolOrderView.class);
         Example.Criteria cr= condition.createCriteria();
         list = pmProtocolOrderViewService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
