package com.blg.edu.common.exception;

import com.blg.edu.common.enums.ErrorCode;

import java.util.Map;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-08
 */
public class SessionAttributeNotExistException extends BaseException {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [data]
     * @return: session异常
     * @Description: 〈〉
     */
    public SessionAttributeNotExistException(Map<String, Object> data) {
        super(ErrorCode.SESSION_ATTR_NOT_EXIST, data);
    }
}
