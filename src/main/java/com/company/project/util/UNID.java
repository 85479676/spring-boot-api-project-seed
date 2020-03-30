package com.company.project.util;

import java.util.UUID;

public class UNID {
    public static final String getUnid() {
        return getUnidLowerCase().toUpperCase();
    }


    public static final String getUnidLowerCase() {
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        return uuidString.replaceAll("-", "");
    }


    public static void main(String[] args) {
        String unid=UNID.getUnidLowerCase();
        System.out.println(unid);
    }
}
