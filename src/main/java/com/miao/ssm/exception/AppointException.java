package com.miao.ssm.exception;

/**
 * Created by 10048 on 2017/10/17.
 * 预约业务异常
 */
public class AppointException extends RuntimeException {
    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
