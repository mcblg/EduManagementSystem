package com.blg.edu.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/login")
    public String toLoginPage() {
        return "/login/login";
    }
}
