package com.feng.common.utils;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author: 冯子玉
 * @Desctription: TODO
 * @Date: Created in 2024/10/15 23:55
 * @Version: 1.0
 */
public class EnumUtil {
    public static <T extends Enum> T[] getAllValues(Class<T> tClass){
        if(!tClass.isEnum()){
            return null;
        }
        return tClass.getEnumConstants();
    }

    public static <T extends Enum> Optional<T> getValue(Class<T> tClass, Predicate<T> predicate){
        return Stream.of(tClass.getEnumConstants()).filter(predicate).findAny();
    }
}
