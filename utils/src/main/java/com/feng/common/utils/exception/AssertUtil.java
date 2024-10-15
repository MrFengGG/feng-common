package com.feng.common.utils.exception;


import com.feng.common.utils.StringUtil;

/**
 * @Author: 冯子玉
 * @Desctription: TODO
 * @Date: Created in 2024/10/16 0:02
 * @Version: 1.0
 */
public class AssertUtil {
    public static void assertTrue(boolean flag, String message){
        if(!flag){
            throw new BusinessException(message);
        }
    }

    public static void assertFalse(boolean value, String message){
        assertTrue(!value, message);
    }

    public static void assertNotNull(Object object, String message){
        if(object == null){
            throw new BusinessException(message);
        }
    }

    public static void assertNotEmpty(String value, String message){
        assertTrue(StringUtil.isNotEmpty(value), message);
    }
}
