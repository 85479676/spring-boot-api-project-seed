package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmUploadFile;
import com.company.project.service.FmUploadFileService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2020/03/27.
*/
@RestController
@RequestMapping("/uploadFile")
public class FmUploadFileController extends DomainedResource{
     @Resource
     private FmUploadFileService fmUploadFileService;

     @PostMapping("/add")
     public Result add(FmUploadFile fmUploadFile) {
        fmUploadFileService.save(fmUploadFile);
        return ResultGenerator.genSuccessResult();
     }

     @DeleteMapping("/{unid}")
     public Result delete(@PathVariable String unid) {
        FmUploadFile fmUploadFile = fmUploadFileService.findById(unid);
        fmUploadFile.setFlagDel(true);
        fmUploadFileService.update(fmUploadFile);
        return ResultGenerator.genSuccessResult(fmUploadFile);
     }

     @PutMapping("/update")
     public Result update(FmUploadFile fmUploadFile) {
        fmUploadFileService.update(fmUploadFile);
        return ResultGenerator.genSuccessResult();
     }

     @GetMapping("/{unid}")
     public Result detail(@PathVariable String unid) {
        FmUploadFile fmUploadFile = fmUploadFileService.findById(unid);
        return ResultGenerator.genSuccessResult(fmUploadFile);
     }

     @GetMapping("/list")
     public Result list(HttpServletRequest request,@RequestParam(required = false) String domainUnid,@RequestParam(defaultValue = "0") Integer page, @RequestParam
        (defaultValue = "20") Integer size) {
        String temp = this.tokenValue(request,domainUnid);
         PageHelper.startPage(page, size);
         List<FmUploadFile> list = null;
         Condition condition = new Condition(FmUploadFile.class);
         Example.Criteria cr= condition.createCriteria();
         list = fmUploadFileService.findByCondition(condition);
         PageInfo pageInfo = new PageInfo(list);
         return ResultGenerator.genSuccessResult(pageInfo);

     }
}
