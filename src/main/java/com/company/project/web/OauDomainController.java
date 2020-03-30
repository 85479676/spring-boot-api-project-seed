package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.OauDomain;
import com.company.project.service.OauDomainService;
import com.company.project.util.UNID;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * 分组接口
 * 增删改查
 * 王永杰
 * Created by CodeGenerator on 2020/02/14.
 */
@RestController
@RequestMapping("/domain")
public class OauDomainController {
    @Resource
    private OauDomainService oauDomainService;

    @PostMapping("/add")
    public Result add(OauDomain oauDomain) {
        oauDomainService.save(oauDomain);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        OauDomain oauOpenId = oauDomainService.findById(unid);
        oauOpenId.setFlagDel(true);
        oauDomainService.update(oauOpenId);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 使用存储过程删除
     *
     * @param unid
     * @return
     */
    @DeleteMapping("/del/{unid}")
    public Result deleteDel(@PathVariable String unid) {
        oauDomainService.deleteDomain(unid);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 存储过程修改
     *
     * @param oauDomain
     * @return
     */
    @PutMapping("/c/update")
    public Result updateUp(OauDomain oauDomain) {
        oauDomainService.updateDomain(oauDomain);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 存储过程添加
     *
     * @param oauDomain
     * @return
     */
    @PostMapping("/c/add")
    public Result addA(OauDomain oauDomain) {
        String unid = UNID.getUnidLowerCase();
        oauDomain.setUnid(unid);
        oauDomainService.addDomain(oauDomain);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(OauDomain oauDomain) {
        oauDomainService.update(oauDomain);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam String unid) {
        OauDomain oauDomain = oauDomainService.findById(unid);
        return ResultGenerator.genSuccessResult(oauDomain);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size, @RequestParam(required = false) String name) {
        PageHelper.startPage(page, size);
        List<OauDomain> list = null;
        Condition condition = new Condition(OauDomain.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null) {
            cr.andCondition("NAME like'%" + name + "%'");
        }
        cr.andCondition("FLAG_DEL=0").andCondition("FLAG_AVA=0");
        list = oauDomainService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
