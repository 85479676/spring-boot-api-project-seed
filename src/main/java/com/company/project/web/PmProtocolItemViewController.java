package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PmProtocolItemView;
import com.company.project.service.PmProtocolItemViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/03.
 */
@RestController
@RequestMapping("/protocolitemview")
public class PmProtocolItemViewController extends DomainedResource {
    @Resource
    private PmProtocolItemViewService pmProtocolItemViewService;

    @PostMapping("/add")
    public Result add(PmProtocolItemView pmProtocolItemView) {
        pmProtocolItemViewService.save(pmProtocolItemView);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PmProtocolItemView pmProtocolItemView = pmProtocolItemViewService.findById(unid);
        pmProtocolItemView.setFlagDel(true);
        pmProtocolItemViewService.update(pmProtocolItemView);
        return ResultGenerator.genSuccessResult(pmProtocolItemView);
    }

    @PutMapping("/update")
    public Result update(PmProtocolItemView pmProtocolItemView) {
        pmProtocolItemViewService.update(pmProtocolItemView);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PmProtocolItemView pmProtocolItemView = pmProtocolItemViewService.findById(unid);
        return ResultGenerator.genSuccessResult(pmProtocolItemView);
    }

    @GetMapping("/list")
    public Result list(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size,
                       @RequestParam(required = false) String name, @RequestParam(required = false) String pasName, @RequestParam(required = false) String porName,
                       @RequestParam(required = false) String proName) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PmProtocolItemView> list = null;
        Condition condition = new Condition(PmProtocolItemView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("name like'%" + name + "%'");
        }
        if (pasName != null) {
            cr.andCondition("pas_name like'%" + pasName + "%'");
        }
        if (porName != null) {
            cr.andCondition("por_name like'%" + porName + "%'");
        }
        if (proName != null) {
            cr.andCondition("pro_name like'%" + proName + "%'");
        }
        cr.andCondition("flag_del=0");
        list = pmProtocolItemViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }
}
