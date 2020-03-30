package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmUploadFileView;
import com.company.project.service.FmUploadFileViewService;
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
@RequestMapping("/loadFileView")
public class FmUploadFileViewController extends DomainedResource {
    @Resource
    private FmUploadFileViewService fmUploadFileViewService;

    @PostMapping("/add")
    public Result add(FmUploadFileView fmUploadFileView) {
        fmUploadFileViewService.save(fmUploadFileView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        FmUploadFileView fmUploadFileView = fmUploadFileViewService.findById(unid);
        fmUploadFileView.setFlagDel(true);
        fmUploadFileViewService.update(fmUploadFileView);
        return ResultGenerator.genSuccessResult(fmUploadFileView);
    }

    @PutMapping("/update")
    public Result update(FmUploadFileView fmUploadFileView) {
        fmUploadFileViewService.update(fmUploadFileView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmUploadFileView fmUploadFileView = fmUploadFileViewService.findById(unid);
        return ResultGenerator.genSuccessResult(fmUploadFileView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "50") Integer size) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmUploadFileView> list = null;
        Condition condition = new Condition(FmUploadFileView.class);
        Example.Criteria cr = condition.createCriteria();
        condition.orderBy("leftInx").asc();
        cr.andCondition("FLAG_DEL=0");
        list = fmUploadFileViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
