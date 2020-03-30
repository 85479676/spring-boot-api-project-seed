package com.company.project.largescreen;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmRiskFileView;
import com.company.project.service.FmRiskFileViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import com.company.project.configurer.DomainedResource;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;
import javax.servlet.http.HttpServletRequest;
import javax.annotation.Resource;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
* Created by CodeGenerator on 2020/03/19.
*/
@RestController
@RequestMapping("/fm/risk/file/view")
public class FmRiskFileViewController extends DomainedResource{
     @Resource
     private FmRiskFileViewService fmRiskFileViewService;

     @PostMapping("/add")
     public Result add(FmRiskFileView fmRiskFileView) {
        fmRiskFileViewService.save(fmRiskFileView);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        FmRiskFileView fmRiskFileView = fmRiskFileViewService.findById(unid);
        fmRiskFileView.setFlagDel(true);
        fmRiskFileViewService.update(fmRiskFileView);
        return ResultGenerator.genSuccessResult(fmRiskFileView);
     }

     @PutMapping("/update")
     public Result update(FmRiskFileView fmRiskFileView) {
        fmRiskFileViewService.update(fmRiskFileView);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        FmRiskFileView fmRiskFileView = fmRiskFileViewService.findById(unid);
        return ResultGenerator.genSuccessResult(fmRiskFileView);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam
        (defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request,domainUnid);
         PageHelper.startPage(page, size);
         List<FmRiskFileView> list = null;
         Condition condition = new Condition(FmRiskFileView.class);
         Example.Criteria cr= condition.createCriteria();
         list = fmRiskFileViewService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
