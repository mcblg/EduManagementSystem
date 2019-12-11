package com.blg.edu.controller.login;

import com.blg.edu.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */
@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/login")
    public String toLoginPage() {
        if (SecurityUtils.getSubject().isAuthenticated()){
            return "forward:/index/index";
        }

        return "/login/login";
    }

    @PostMapping("/doLogin")
    public String doLogin(String userName, String password, ModelMap modelMap) {
        Subject curUser = SecurityUtils.getSubject();
        try {
            curUser.login(new UsernamePasswordToken(userName, password));
            User user = (User) curUser.getPrincipal();
            if (user == null) {
                throw new AuthenticationException();
            }
            return "forward:/index/index";
        } catch (UnknownAccountException uae) {
            modelMap.addAttribute("loginMsg", "用户名或密码错误");
            log.warn("userName不存在:", uae);
            return "forward:/login/login";
        } catch (IncorrectCredentialsException ice) {
            modelMap.addAttribute("loginMsg", "用户名或密码错误");
            log.warn("密码错误", ice);
            return "forward:/login/login";
        } catch (LockedAccountException lae) {
            modelMap.addAttribute("loginMsg", "用户账号被锁定或者已失效");
            log.warn("用户账号被锁定或者已失效", lae);
            return "forward:/login/login";
        } catch (AuthenticationException ae) {
            modelMap.addAttribute("loginMsg", "登录失败"+ ae.getMessage());
            log.warn("登录出错", ae);
            return "forward:/login/login";
        }

    }
}
