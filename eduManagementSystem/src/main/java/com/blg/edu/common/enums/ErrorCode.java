package com.blg.edu.common.enums;

import lombok.ToString;
import org.springframework.http.HttpStatus;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-03-30
 */
@ToString
public enum ErrorCode {
    RESOURCE_NOT_FOUND(4001, HttpStatus.NOT_FOUND, "未找到该资源"),
    REQUEST_VALIDATION_FAILED(4002, HttpStatus.BAD_REQUEST, "请求数据格式验证失败"),
    SESSION_ATTR_NOT_EXIST(4100, HttpStatus.NOT_FOUND, "SESSION信息不存在"),
    SHIRO_ERROR(4200, HttpStatus.FORBIDDEN, "鉴权或授权过程出错"),
    SHIRO_UNAUTHENTICATED(4201, HttpStatus.FORBIDDEN, "未登录"),
    SHIRO_UNAUTHORIZED(4203, HttpStatus.FORBIDDEN, "无权限");

    private final int code;
    private final HttpStatus status;
    private final String message;

    ErrorCode(int code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
