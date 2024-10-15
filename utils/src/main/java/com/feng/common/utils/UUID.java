package com.feng.common.utils;

/**
 * @Author: 冯子玉
 * @Desctription: TODO
 * @Date: Created in 2024/10/15 23:54
 * @Version: 1.0
 */
public class UUID {
    public static String newString(){
        return java.util.UUID.randomUUID().toString();
    }
}
