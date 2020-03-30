package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmFacilityMapView;
import com.company.project.service.FmFacilityMapViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/11.
 */
@RestController
@RequestMapping("/facilitymapview")
public class FmFacilityMapViewController extends DomainedResource {
    @Resource
    private FmFacilityMapViewService fmFacilityMapViewService;

    @PostMapping("/add")
    public Result add(FmFacilityMapView fmFacilityMapView) {
        fmFacilityMapViewService.save(fmFacilityMapView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        FmFacilityMapView fmFacilityMapView = fmFacilityMapViewService.findById(unid);
        fmFacilityMapView.setFlagDel(true);
        fmFacilityMapViewService.update(fmFacilityMapView);
        return ResultGenerator.genSuccessResult(fmFacilityMapView);
    }

    @PutMapping("/update")
    public Result update(FmFacilityMapView fmFacilityMapView) {
        fmFacilityMapViewService.update(fmFacilityMapView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmFacilityMapView fmFacilityMapView = fmFacilityMapViewService.findById(unid);
        return ResultGenerator.genSuccessResult(fmFacilityMapView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                       @RequestParam(required = false) String domainUnid,@RequestParam(required = false)String unid) {
//        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmFacilityMapView> list = null;
        Condition condition = new Condition(FmFacilityMapView.class);
        Example.Criteria cr = condition.createCriteria();
        if (domainUnid!=null&&domainUnid!=""){
            cr.andCondition("DOMAIN_UNID='"+domainUnid+"'");
        }
        if (unid!=null&&unid!=""){
            cr.andCondition("UNID='"+unid+"'");
        }
//        else {
//            cr.andCondition(temp);
//        }
       cr.andCondition("FLAG_DEL=0");

        list = fmFacilityMapViewService.findByCondition(condition);

        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
