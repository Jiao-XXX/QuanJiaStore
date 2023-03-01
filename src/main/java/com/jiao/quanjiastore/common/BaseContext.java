package com.jiao.quanjiastore.common;

/**
 * @Author: Jiao
 * @Date: 2023/3/1 17:22
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
 */
public class BaseContext {
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    static Long getCurrentId(){
        return threadLocal.get();
    }
}
