package com.company.project.util;

import net.sf.json.JSONObject;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
@SuppressWarnings("deprecation")
public class WXHelper {

    public static void main(String[] args) {
        // 微信请求接口

        WXHelper help = new WXHelper();
        Map<String, String> temp = help.getSignature("https://terata.com.cn");

    }


    @SuppressWarnings("deprecation")
    public String getAccessToken(String appId, String appSecret) {
        // 网页授权接口
        String GetPageAccessTokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="
                + appId + "&secret=" + appSecret;

        HttpClient client = null;
        String access_token = null;
        int expires_in = 0;
        try {
            client = new DefaultHttpClient();
            HttpGet httpget = new HttpGet(GetPageAccessTokenUrl);
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String response = client.execute(httpget, responseHandler);
            JSONObject OpenidJSONO = JSONObject.fromObject(response);
            access_token = String.valueOf(OpenidJSONO.get("access_token"));// 获取access_token
            expires_in = Integer.parseInt(String.valueOf(OpenidJSONO.get("expires_in")));// 获取时间
        } catch (Exception e) {
            // throw new CommonRuntimeException("获取AccessToken出错！");
        } finally {
            client.getConnectionManager().shutdown();
        }
        return access_token;
    }

    public String getTicket(String accessToken) {
        // 网页授权接口
        String GetPageAccessTokenUrl = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=" + accessToken
                + "&type=jsapi";
        HttpClient client = null;
        String ticket = "";
        int expires_in = 0;
        try {
            client = new DefaultHttpClient();
            HttpGet httpget = new HttpGet(GetPageAccessTokenUrl);
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String response = client.execute(httpget, responseHandler);
            JSONObject OpenidJSONO = JSONObject.fromObject(response);
            ticket = String.valueOf(OpenidJSONO.get("ticket"));// 获取ticket
            expires_in = Integer.parseInt(String.valueOf(OpenidJSONO.get("expires_in")));// 获取时间
        } catch (Exception e) {
            // throw new CommonRuntimeException("获取Ticket出错！");
        } finally {
            client.getConnectionManager().shutdown();
        }

        return ticket;

    }

    public String SHA1(String str) {
        try {
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1"); // 如果是SHA加密只需要将"SHA-1"改成"SHA"即可
            digest.update(str.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexStr = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexStr.append(0);
                }
                hexStr.append(shaHex);
            }
            return hexStr.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;

    }

    public String getToken()
    {
        String appid = "wx99e93d1f91012250";// 微信公众号的appid
        String appsecret = "237adb3893b81beed76f28bd1e5f6501";// 微信公众号的appsecret
       return  getAccessToken(appid,appsecret);
    }

    public Map<String, String> getSignature(String url) {


        Map<String, String> wxMap = new HashMap<>();
        String signature = "";

        String appid = "wx99e93d1f91012250";// 微信公众号的appid
        String appsecret = "237adb3893b81beed76f28bd1e5f6501";// 微信公众号的appsecret
        wxMap.put("appid", appid);
        // 获取noncestr
        String noncestr = UUID.randomUUID().toString();
        wxMap.put("noncestr", noncestr);
        // 获取timestamp
        String timestamp = Long.toString(System.currentTimeMillis() / 1000);
        wxMap.put("timestamp", timestamp);
        // 获取access_token
        String access_token = getAccessToken(appid, appsecret);
        wxMap.put("access_token", access_token);
        // 获取jspai_ticket
        String jsapi_ticket = getTicket(access_token);
        wxMap.put("jsapi_ticket", jsapi_ticket);
        // 将四个数据进行组合，传给SHA1进行加密
        String str = "jsapi_ticket=" + jsapi_ticket + "&noncestr=" + noncestr + "&timestamp=" + timestamp + "&url="
                + url;

        // sha1加密
        signature = SHA1(str);
        wxMap.put("signature", signature);
        return wxMap;

    }

}
