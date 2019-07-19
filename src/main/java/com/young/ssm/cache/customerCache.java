package com.young.ssm.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:dep
 * @Date: 2019/7/18 10:24
 * @Description: 自定义缓存 最简单的实现 可以放到redis中做缓存
 */
public class customerCache {

    private  Map<String,Object> cache = new HashMap<>();

    /**
     * 加入缓存
     * @param key
     * @param value
     */
    public void putObject(String key,Object value){
        cache.put(key,value);
    }

    /**
     * 缓存中取数据
     * @param key
     * @return
     */
    public Object pullObject(String key){
        return cache.get(key);
    }

    /**
     * 判断是否存在改缓存
     * @param key
     * @return
     */
    public Boolean hasObject(String key){
        return  cache.containsKey(key);
    }

    /**
     * 清空缓存
     */
    public void clear(){
        cache.clear();
    }

    /**
     * 刷新缓存
     */
    public void flush(){
        cache.clear();
    }
}
