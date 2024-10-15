package com.feng.common.utils;

import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: 冯子玉
 * @Desctription: StringUtils
 * @Date: Created in 2024/10/15 23:37
 * @Version: 1.0
 */
public class StringUtil {
    public static boolean isEmpty(String value){
        return value == null || value.isEmpty();
    }

    public static boolean isEmpty(Object value){
        return value == null || String.valueOf(value).isEmpty();
    }

    public static boolean isAllNotEmpty(Object ...value){
        for(Object val : value){
            if(StringUtil.isEmpty(val)){
                return false;
            }
        }
        return true;
    }

    public static boolean isNotEmpty(Object value){
        return !isEmpty(value);
    }

    public static boolean isNotEmpty(String value){
        return !isEmpty(value);
    }


    public static String join(String[] strings, String joiner){
        if(strings == null){
            return null;
        }
        return String.join(joiner, strings);
    }

    public static<T> String join(Collection<T> strings, String joiner){
        if(CollectionUtils.isEmpty(strings)){
            return null;
        }
        return strings.stream().map(String::valueOf).collect(Collectors.joining(joiner));
    }

    public static Collection<String> split(String str, String splitter){
        if(isEmpty(str)){
            return null;
        }
        return Stream.of(str.split(splitter)).collect(Collectors.toList());
    }

    public static String getEmptyParams(int length){
        List<String> emptyParams = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            emptyParams.add("?");
        }
        return join(emptyParams, ",");
    }
}
