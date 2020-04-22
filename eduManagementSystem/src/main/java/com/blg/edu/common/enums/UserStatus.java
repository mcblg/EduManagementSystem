package com.blg.edu.common.enums;

import lombok.Getter;

/**
 * @description: 用户状态
 * @author: chenjiahao
 * @create: 2019-12-30
 */
@Getter
public enum UserStatus {

    /*正常*/
    AVAILABLE(0),

    /*锁定*/
    LOCK(1),

    /*无效*/
    INVALID(2);

    private Integer statusCode;

    UserStatus(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
