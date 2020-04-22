package com.blg.edu.common.config;

import com.blg.edu.common.enums.ErrorCode;
import com.blg.edu.common.exception.SessionAttributeNotExistException;
import com.blg.edu.entity.dto.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

/**
 * @description: 全局异常处理
 * @author: chenjiahao
 * @create: 2020-04-08
 */
@Slf4j
@RestControllerAdvice()
public class GlobalExceptionHandler {

    @ExceptionHandler(SessionAttributeNotExistException.class)
    public ResponseEntity<ErrorResponse> handleSessionAttributeNotExistException(SessionAttributeNotExistException se, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(se, request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(ShiroException.class)
    public ResponseEntity<ErrorResponse> handleShiroException(ShiroException se, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(ErrorCode.SHIRO_ERROR.getCode());
        errorResponse.setMessage(ErrorCode.SHIRO_ERROR.getMessage());
        errorResponse.setStatus(ErrorCode.SHIRO_ERROR.getStatus().value());
        errorResponse.setPath(request.getRequestURI());
        errorResponse.setTimestamp(Instant.now());
        log.error(se.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorResponse);
    }

    @ExceptionHandler(UnauthenticatedException.class)
    public ResponseEntity<ErrorResponse> handleUnauthenticatedException(UnauthenticatedException ue, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(ErrorCode.SHIRO_UNAUTHENTICATED.getCode());
        errorResponse.setMessage(ErrorCode.SHIRO_UNAUTHENTICATED.getMessage());
        errorResponse.setStatus(ErrorCode.SHIRO_UNAUTHENTICATED.getStatus().value());
        errorResponse.setPath(request.getRequestURI());
        errorResponse.setTimestamp(Instant.now());
        log.error(ue.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorResponse);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorResponse> handleUnauthorizedException(UnauthorizedException ue, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(ErrorCode.SHIRO_UNAUTHORIZED.getCode());
        errorResponse.setMessage(ErrorCode.SHIRO_UNAUTHORIZED.getMessage());
        errorResponse.setStatus(ErrorCode.SHIRO_UNAUTHORIZED.getStatus().value());
        errorResponse.setPath(request.getRequestURI());
        errorResponse.setTimestamp(Instant.now());
        log.error(ue.getMessage());
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(errorResponse);
    }
}
