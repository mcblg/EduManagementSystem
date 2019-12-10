package com.blg.edu.controller.index;

import com.blg.edu.entity.User;
import com.blg.edu.mapper.UserMapper;
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
        User user1 = userMapper.getUserById((long) 1);
        modelMap.addAttribute("user", user1);
        return "/index/index";
    }
}
