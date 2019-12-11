package com.blg.edu.controller.index;

import com.blg.edu.common.util.SHA256Utils;
import com.blg.edu.entity.User;
import com.blg.edu.mapper.UserMapper;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-09
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/index")
    public String toIndexPage(ModelMap modelMap) {
//        User user1 = userMapper.getUserById((long) 1);
//        modelMap.addAttribute("user", user1);
        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();
        System.out.println(salt);
        String password = SHA256Utils.encrypt(salt, "123456");
        modelMap.addAttribute("salt", salt);
        modelMap.addAttribute("password", password);
        return "/index/index";
    }
}
