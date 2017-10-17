package com.miao.ssm.exception;

/**
 * Created by 10048 on 2017/10/17.
 * 库存不足异常
 */
public class NoNumberException extends RuntimeException {

    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }

}
