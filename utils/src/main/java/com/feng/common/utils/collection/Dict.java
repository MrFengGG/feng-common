package com.feng.common.utils.collection;


import com.feng.common.utils.StringUtil;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冯子玉
 * @Desctription: TODO
 * @Date: Created in 2024/10/16 0:02
 * @Version: 1.0
 */
public class Dict extends HashMap<String, Object> {

    public Dict(){
        super();
    }

    public Dict(Map<String, Object> map){
        super(map);
    }

    public Dict setIfNotEmpty(String key, String value){
        if(StringUtil.isNotEmpty(value)){
            this.put(key, value);
        }
        return this;
    }

    public Dict set(String key, Object value){
        this.put(key,value);
        return this;
    }

    public Dict setIfNotNull(String key, Object value) {
        if(value != null) {
            this.put(key,value);
        }
        return this;
    }

    public <V> V get(String key, Class<V> vClass){
        Object value = this.get(key);
        return value == null ? null : vClass.cast(value);
    }

    public <V> V getOrDefault(String key, Class<V> vClass, V defaultValue){
        Object value = this.get(key);
        return value == null ? defaultValue : vClass.cast(value);
    }

    public Integer getInt(String key, Integer defaultValue){
        Object value = this.get(key);
        return value == null ? defaultValue : Integer.parseInt(String.valueOf(value));
    }

    public Integer getInt(String key){
        return getInt(key, null);
    }

    public String getStr(String key){
        return getStr(key, null);
    }

    public String getStr(String key, String defaultValue){
        Object value = this.get(key);
        return value == null ? defaultValue : String.valueOf(value);
    }

    public Boolean getBoolean(String key, Boolean defaultValue){
        String value = this.getStr(key);
        return value == null ? defaultValue : Boolean.parseBoolean(value);
    }

    public Boolean getBoolean(String key){
        return getBoolean(key, null);
    }

    public <T> Collection<T> getCollection(String key){
        return (Collection<T>) this.get(key);
    }
}
