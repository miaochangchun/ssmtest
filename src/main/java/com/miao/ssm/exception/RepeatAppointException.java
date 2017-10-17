package com.miao.ssm.exception;

/**
 * Created by 10048 on 2017/10/17.
 * 重复预约异常
 */
public class RepeatAppointException extends RuntimeException {
    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }
}
