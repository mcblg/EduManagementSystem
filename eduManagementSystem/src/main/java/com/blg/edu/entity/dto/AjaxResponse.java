package com.blg.edu.entity.dto;

import com.blg.edu.common.enums.ResponseCode;
import lombok.Data;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.Instant;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-03-30
 */
@Data
@ToString
public class AjaxResponse<T> {

    private int code;
    private HttpStatus status;
    private String message;
    private String path;
    private Instant timestamp;
    private T data;

    public AjaxResponse() {
    }

    public AjaxResponse(int code, HttpStatus status, String message, String path, T data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.path = path;
        this.timestamp = Instant.now();
        this.data = data;
    }

    public static AjaxResponse success(String path, Object data) {
        return new AjaxResponse(ResponseCode.SUCCESS.getCode(), HttpStatus.OK, ResponseCode.SUCCESS.getMessage(), path, data);
    }

    public static AjaxResponse create(ResponseCode responseCode, HttpStatus httpStatus, String path, Object data) {
        return new AjaxResponse(responseCode.getCode(), httpStatus, responseCode.getMessage(), path, data);
    }
}
