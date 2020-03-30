package com.company.project.wx;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.util.WXHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RequestMapping("/wx")
@RestController
public class WxController {
    @Resource
    WXHelper wxHelper;

    @GetMapping("/token")
    public Result token() {
        String map = wxHelper.getToken();
        return ResultGenerator.genSuccessResult(map);
    }

    @GetMapping
    public Result detail(@RequestParam String url) {
        Map<String, String> map = wxHelper.getSignature(url);
        return ResultGenerator.genSuccessResult(map);
    }

}
