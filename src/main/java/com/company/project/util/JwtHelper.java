package com.company.project.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtHelper {


    //token过期时间目前暂时是15分钟
    private static final long EXPIRE_TIME = 15 * 60 * 1000;
    //公共密钥
    private static final String TOKEN_SECRET = "wddcdfdfhjtjthjdffsdfsd33hcskdncksndcnsnsvsdcsdc";

    //生成token
    public static String sign(String username, String userid) {
        String token = null;
        try {
            //过期时间
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            //私钥及加密算法
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            //设置头部信息
            Map<String, Object> header = new HashMap<>(2);
            header.put("typ", "JWT");
            header.put("alg", "HS256");
            //附带username，userid等信息
            token = JWT.create()
                    .withHeader(header)
//                    .withClaim("username", username)
//                    .withClaim("userid", userid)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (JWTCreationException ex) {
            ex.printStackTrace();
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return token;
    }

    //验证是否登录状态
    public static boolean verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

}
