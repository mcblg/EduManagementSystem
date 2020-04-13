package com.blg.edu.common.enums;

import org.springframework.http.HttpStatus;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-03-30
 */
public enum ResponseCode {
    SUCCESS(0, HttpStatus.OK, "SUCCESS"),
    LOGIN_FAILED_USER_NOT_EXIST(2001, HttpStatus.OK, "LOGIN FAILED: USER NOT EXIST"),
    LOGIN_FAILED_PASSWORD_IS_NOT_CORRECT(2002, HttpStatus.OK, "LOGIN FAILED: PASSWORD IS NOT CORRECT"),
    LOGIN_FAILED_USER_IS_LOCKED(2003, HttpStatus.OK, "LOGIN_FAILED: USER IS LOCKED"),
    LOGIN_FAILED(2000, HttpStatus.OK, "LOGIN FAILED");


    private final int code;
    private final HttpStatus status;
    private final String message;

    ResponseCode(int code, HttpStatus status, String message) {
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
