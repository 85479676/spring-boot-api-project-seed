package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.OauOpenId;
import com.company.project.service.OauOpenIdService;
import com.company.project.util.MD5Util;
import com.company.project.util.RedisService;
import com.company.project.util.SHA1;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/02/19.
 * 用户接口增删改
 */
@RestController
@RequestMapping("/legopenid")
public class OauOpenIdController {
    @Autowired
    private RedisService redisService;
    @Resource
    private OauOpenIdService oauOpenIdService;
    @Resource
    private MD5Util md5Util;

//    @PostMapping("/add")
//    public Result add(OauOpenId oauOpenId, String passwd) {
//        String sala = UNID.getUnidLowerCase();
//        String pass=SHA1.getHash(passwd + sala);
//        oauOpenId.setSalt(sala);
//        oauOpenId.setCredential(pass);
//        oauOpenIdService.save(oauOpenId);
//        return ResultGenerator.genSuccessResult();
//    }
    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        OauOpenId oauOpenId = oauOpenIdService.findById(unid);
        oauOpenId.setFlagDel(true);
        oauOpenIdService.update(oauOpenId);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(OauOpenId oauOpenId) {
        oauOpenIdService.update(oauOpenId);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/lock/{unid}")
    public Result updatelock(@PathVariable String unid) {
        OauOpenId oauOpenId = oauOpenIdService.findById(unid);
        oauOpenId.setFlagLock(true);
        oauOpenIdService.update(oauOpenId);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/login")
    public Result login(String unid) {
        OauOpenId openId = oauOpenIdService.findById(unid);
        openId.getNameLogin().equals(openId.getFlagLock());

        return null;
    }

    @PutMapping("/onlock/{unid}")
    public Result updateonlock(@PathVariable String unid) {
        OauOpenId oauOpenId = oauOpenIdService.findById(unid);
        oauOpenId.setFlagLock(false);
        oauOpenIdService.update(oauOpenId);
        return ResultGenerator.genSuccessResult();
    }


    @PutMapping("/{unid}")
    public Result passwords(@PathVariable String unid, @RequestParam String password) {
        OauOpenId oauOpenId = oauOpenIdService.findById(unid);

        String salt = oauOpenId.getSalt();

        oauOpenId.setCredential(SHA1.getHash(password + salt));
//        String md5 = MD5Util.encode(password);
//        oauOpenId.setSalt(md5);
        oauOpenIdService.update(oauOpenId);
        return ResultGenerator.genSuccessResult();
    }




    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        OauOpenId oauOpenId = oauOpenIdService.findById(unid);

        return ResultGenerator.genSuccessResult(oauOpenId);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "50") Integer size) {
        PageHelper.startPage(page, size);
        List<OauOpenId> list = oauOpenIdService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
