package com.xuyj.platform.common.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * Gson工具类
 */
public class GsonUtils {
    /**
     * 序列化
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        return gson.toJson(obj);
    }

    /**
     * 反序列化
     * @param json
     * @param t
     * @return
     * @param <T>
     */
    public static <T> T fromJson(String json, Class<T> t) {
        Gson gson = new Gson();
        return gson.fromJson(json, t);
    }
    /**
     * 反序列化
     * @param json
     * @param type
     * @return
     * @param <T>
     */
    public static <T> T fromJson(String json, Type type) {
        Gson gson = new Gson();
        return gson.fromJson(json, type);
    }
}
