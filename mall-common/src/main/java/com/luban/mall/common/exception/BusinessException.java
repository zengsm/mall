package com.luban.mall.common.exception;
/**
 * @Description:业务异常处理
 * @Author: 伯乐
 * @Date: 2019/5/17 16:14
 */
public class BusinessException extends Exception {

    public BusinessException(){super();}

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
