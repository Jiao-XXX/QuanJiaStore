package com.jiao.quanjiastore.common;

/**
 * 自定义任务异常
 * @Author: Jiao
 * @Date: 2023/3/1 20:30
 */
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
