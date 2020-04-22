package com.blg.edu.common.config;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @description: 错误页面配置
 * @author: chenjiahao
 * @create: 2020-04-08
 */
@Component
public class ErrorPageResolver implements ErrorViewResolver {

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView mv = new ModelAndView();
        switch (status) {
            case NOT_FOUND:
                mv.setViewName("redirect:/error/404.html");
                break;
            case INTERNAL_SERVER_ERROR:
                mv.setViewName("redirect:/error/500.html");
            default:
                mv.setViewName("redirect:/error/404.html");
        }
        return mv;
    }
}
