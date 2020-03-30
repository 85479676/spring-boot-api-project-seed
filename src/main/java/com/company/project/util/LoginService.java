package com.company.project.util;

import com.company.project.model.OauAccessToken;
import com.company.project.model.OauOpenId;
import com.company.project.service.OauAccessTokenService;
import com.company.project.service.OauOpenIdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Service
public class LoginService {
    private Logger logger = LoggerFactory.getLogger(LoginService.class);
    @Autowired
    private RedisService redisService;
    @Autowired
    private OauOpenIdService openIdService;
    @Autowired
    private OauAccessTokenService tokenService;
    //    @Autowired
//    private JwtHelper jwtHelper;
    @Resource
    private MD5Util md5Util;


    public String login(String username, String password, HttpServletRequest request) {
        String ip4 = IpUtil.getIpAddr(request);
        OauAccessToken accessToken = new OauAccessToken();
        OauOpenId user = openIdService.selectByName(username);
        String sale = user.getSalt();
        password = SHA1.getHash(password + sale);
        if (Objects.equals(user.getNameLogin(), username) && Objects.equals(user.getCredential(), password)) {
            String token = UUID.randomUUID().toString().replaceAll("-", "");
            String id = user.getUnid();
            String domain=user.getDomainUnid();
            String timeString = String.valueOf(accessToken.getExpiresIn());
            redisService.set(token, username);
//            redisService.set(timeString, username);
            accessToken.setToken(token);
            accessToken.setOpenId(user.getUnid());
            accessToken.setDomainUnid(user.getDomainUnid());
            accessToken.setDatimeUnix(new Date().getTime());
            accessToken.setExpiresIn(604800);
            accessToken.setIp4(ip4);
            tokenService.save(accessToken);
            return "token=" + token + "&ID=" + id+"&DOMAIN=" + domain;

        } else {
            return "用户名或密码错误，登录失败！";
        }
    }

//    @Override
//    public boolean check(OauAccessToken model) {
//        boolean result = false;
//        if (model != null) {
//            String userId = model.getToken().toString();
//            String token = model.getToken();
//            String authenticatedToken = redisClient.get(userId);
//            if (authenticatedToken != null && authenticatedToken.equals(token)) {
//                redisClient.expire(userId, RedisClient.TOKEN_EXPIRES_SECOND);
//                result = true;
//            }
//        }
//        return result;
//    }


    public String logout(HttpServletRequest request) {
        String token = request.getHeader("token");
//        Boolean delete = redisService.(token);
//        if (!delete) {
//            return "注销失败，请检查是否登录！";
//        }
        return "注销成功！";
    }
}
