package com.company.project.util;

import java.util.Collection;
import java.util.Map;

public class Empty {
    public static boolean isEmpty(byte[] array) {
        return array == null || array.length == 0;
    }


    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }


    public static boolean isEmpty(Double dou) {
        return dou == null || dou == 0.0;
    }


    public static boolean isEmpty(Integer integer) {
        return integer == null || integer == 0;
    }


    public static boolean isEmpty(Long lon) {
        return lon == null || lon == 0;
    }


    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.size() == 0;
    }


    public static boolean isEmpty(String string) {
        return string == null || string.equals("");
    }


    public static boolean isEmpty(String[] array) {
        return array == null || array.length == 0;
    }


    public static <T> T notNull(T t) {
        if (t == null)
            throw new NullPointerException();
        else
            return t;
    }
}