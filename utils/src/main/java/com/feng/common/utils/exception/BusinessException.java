package com.feng.common.utils.exception;

import lombok.Getter;

/**
 * @Author: 冯子玉
 * @Desctription: TODO
 * @Date: Created in 2024/10/16 0:02
 * @Version: 1.0
 */
@Getter
public class BusinessException extends RuntimeException {

    private Integer errorCode;

    public BusinessException(Integer errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
