package com.company.project.util;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.OauOpenId;
import com.company.project.service.OauOpenIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/")
public class LoginController {
    @Resource
    private OauOpenIdService oauOpenIdService;
    @Autowired
    protected LoginService loginService;

    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request) {

        return loginService.login(username, password, request);
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        return loginService.logout(request);
    }

    @PostMapping("/add")
    public Result add(OauOpenId oauOpenId, String nameLogin, String credential, String domainUnid) {
        OauOpenId urse = oauOpenIdService.selectByName(nameLogin);
//         ResultGenerator.genSuccessResult(""+urse.getNameLogin()+"用户名重复");
        if (urse == null) {
            String sala = UNID.getUnidLowerCase();
            String pass = SHA1.getHash(credential + sala);
            oauOpenId.setDomainUnid(domainUnid);
            oauOpenId.setSalt(sala);
            oauOpenId.setCredential(pass);
            oauOpenIdService.save(oauOpenId);
        } else {
            return ResultGenerator.genSuccessResult("用户名重复,请重新输入");
        }
        return ResultGenerator.genSuccessResult("注册成功!");

    }


}