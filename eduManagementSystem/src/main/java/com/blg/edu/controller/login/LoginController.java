package com.blg.edu.controller.login;

import com.blg.edu.common.enums.ResponseCode;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @description:
 * @author: chenjiahao
 * @create: 2019-12-10
 */
@Slf4j
@RestController
public class LoginController {

    @PostMapping("/doLogin")
    public ResponseEntity<AjaxResponse<String>> doLogin(String userName, String password) {
        Subject curUser = SecurityUtils.getSubject();
        try {
            curUser.login(new UsernamePasswordToken(userName, password));
            User user = (User) curUser.getPrincipal();
            if (user == null) {
                throw new AuthenticationException();
            }
            Session session = curUser.getSession();
            session.setAttribute("user", user);
            return ResponseEntity.ok(AjaxResponse.success("/edu/doLogin", ResponseCode.SUCCESS.getMessage()));
        } catch (UnknownAccountException uae) {
            log.warn("userName不存在:", uae.getMessage());
            return ResponseEntity.ok(AjaxResponse.create(ResponseCode.LOGIN_FAILED_USER_NOT_EXIST, HttpStatus.OK, "/edu/doLogin", ResponseCode.LOGIN_FAILED_USER_NOT_EXIST.getMessage()));
        } catch (IncorrectCredentialsException ice) {
            log.warn("密码错误", ice.getMessage());
            return ResponseEntity.ok(AjaxResponse.create(ResponseCode.LOGIN_FAILED_PASSWORD_IS_NOT_CORRECT, HttpStatus.OK, "/edu/doLogin", ResponseCode.LOGIN_FAILED_PASSWORD_IS_NOT_CORRECT.getMessage()));
        } catch (LockedAccountException lae) {
            log.warn("用户账号被锁定或者已失效", lae.getMessage());
            return ResponseEntity.ok(AjaxResponse.create(ResponseCode.LOGIN_FAILED_USER_IS_LOCKED, HttpStatus.OK, "/edu/doLogin", ResponseCode.LOGIN_FAILED_USER_IS_LOCKED.getMessage()));
        } catch (AuthenticationException ae) {
            log.warn("登录出错", ae.getMessage());
            return ResponseEntity.ok(AjaxResponse.create(ResponseCode.LOGIN_FAILED, HttpStatus.OK, "/edu/doLogin", ResponseCode.LOGIN_FAILED.getMessage()));
        }

    }

}
