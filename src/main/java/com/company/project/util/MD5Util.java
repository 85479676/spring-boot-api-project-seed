package com.company.project.util;

import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.util.UUID;

@RestController
public class MD5Util {
    private static final String SALT = "tamboo";

    public static String encode(String password) {
        password = password + SALT;
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        char[] charArray = password.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }

            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    public static final String getUnidLowerCase() {
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        return uuidString.replaceAll("-", "");
    }

    public static void main(String[] args) {

        String id = null;
        id = "12345466";
        id=getUnidLowerCase();
        System.out.println(id);


    }
}
