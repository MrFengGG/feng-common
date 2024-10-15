package com.feng.common.utils.bean;

import java.lang.reflect.Field;

/**
 * @Author: 冯子玉
 * @Desctription: TODO
 * @Date: Created in 2024/10/16 0:02
 * @Version: 1.0
 */
public class ReflectUtil {
    public static <T> T getSampleInstance(Class<T> tClass){
        try {
            return (T) tClass.getConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("cannot initialize class:" + tClass);
        }
    }

    public static Object getField(Field field, Object target) {
        try {
            return field.get(target);
        } catch (IllegalAccessException var3) {
            throw new IllegalStateException("Unexpected reflection exception - " + var3.getClass().getName() + ": " + var3.getMessage());
        }
    }
}
