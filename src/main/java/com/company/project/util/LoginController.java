package com.company.project.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/")
public class LoginController {

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
}