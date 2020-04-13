package com.blg.edu.common.exception;

import com.blg.edu.common.enums.ErrorCode;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-08
 */
public abstract class BaseException extends RuntimeException {

    private final ErrorCode errorCode;
    private final HashMap<String, Object> data = new HashMap<>();

    public BaseException(ErrorCode error, Map<String, Object> data) {
        super(error.getMessage());
        this.errorCode = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    protected BaseException(ErrorCode error, Map<String, Object> data, Throwable cause) {
        super(error.getMessage(), cause);
        this.errorCode = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

    public ErrorCode getError() {
        return errorCode;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
