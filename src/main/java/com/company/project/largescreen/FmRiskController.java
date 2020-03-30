package com.company.project.largescreen;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.FmRisk;
import com.company.project.model.FmRiskFileView;
import com.company.project.model.FmRisks;
import com.company.project.service.FmRiskFileViewService;
import com.company.project.service.FmRiskService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/19.
 */
@RestController
@RequestMapping("/fmrisk")
public class FmRiskController extends DomainedResource {
    @Resource
    private FmRiskService fmRiskService;


    @Resource
    private FmRiskFileViewService fmRiskFileViewService;

    @PostMapping("/add")
    public Result add(FmRisk fmRisk) {
        fmRiskService.save(fmRisk);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        FmRisk fmRisk = fmRiskService.findById(unid);
        fmRisk.setFlagDel(true);
        fmRiskService.update(fmRisk);
        return ResultGenerator.genSuccessResult(fmRisk);
    }

    @PutMapping("/update")
    public Result update(FmRisk fmRisk) {
        fmRiskService.update(fmRisk);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        FmRisk fmRisk = fmRiskService.findById(unid);
        return ResultGenerator.genSuccessResult(fmRisk);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size, @RequestParam(required = false) String level, @RequestParam(required = false) String flagDone) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmRiskFileView> list = null;
        Condition condition = new Condition(FmRisk.class);
        Example.Criteria cr = condition.createCriteria();
        if (level != null && level != "") {
            cr.andCondition("LEVEL='" + level + "'");
        }

        if (flagDone != null && flagDone != "") {
            cr.andCondition("FLAG_DONE='" + flagDone + "'");
        }
        cr.andCondition("FLAG_DEL=0");
        list = fmRiskFileViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


    @GetMapping("/risk/list")
    public Result listRisk(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam
            (defaultValue = "20") Integer size, @RequestParam(required = false) double flagDone) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<FmRisks> list = fmRiskService.getRisk(domainUnid, flagDone);
        double ll = 1.0;
        for (FmRisks risk : list
        ) {
//            if (risk.getAmount() == 1) {
//                risk.setLocation("一般隐患");
//            } else
            if (risk.getLevel() == 2) {
                risk.setLocation("较大隐患");
            } else if (risk.getLevel() == 3) {
                risk.setLocation("重大隐患");
            } else if (risk.getLevel() == 4) {
                risk.setLocation("特大隐患");
            } else {
                risk.setLocation("一般隐患");
            }
            risk.setAmount(risk.getAiid());
            risk.setKey(risk.getLevel());
        }
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
