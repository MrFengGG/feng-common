package com.feng.common.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 * @Author: 冯子玉
 * @Desctription: TODO
 * @Date: Created in 2024/10/15 23:54
 * @Version: 1.0
 */
public class EncryptUtil {
    public static String encode(String passWord){
        return BCrypt.withDefaults().hashToString(10, passWord.toCharArray());
    }

    public static boolean match(String password, String encPassword){
        return BCrypt.verifyer().verify(password.toCharArray(), encPassword.toCharArray()).verified;
    }
}
