//package com.blg.edu.controller.index;
//
//import com.blg.edu.common.util.SHA256Utils;
//import com.blg.edu.common.util.SessionAttributeUtil;
//import com.blg.edu.entity.User;
//import com.blg.edu.entity.dto.AjaxResponse;
//import com.blg.edu.mapper.UserMapper;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.apache.shiro.authz.annotation.RequiresRoles;
//import org.apache.shiro.crypto.SecureRandomNumberGenerator;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @description:
// * @author: chenjiahao
// * @create: 2019-12-09
// */
//@RestController
//public class IndexController {
//
//    @Autowired
//    UserMapper userMapper;
//
//    @GetMapping("sessionAttr")
//    public AjaxResponse<User> getSessionAttr(HttpServletRequest request) {
//        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
//        return AjaxResponse.success(request.getRequestURI(), user);
//    }
//
//
//
//    @GetMapping("/generatePassword")
//    public String generatePassword(String str) {
//        String salt = new SecureRandomNumberGenerator().nextBytes().toHex();
//        System.out.println(salt);
//        String password = SHA256Utils.encrypt(salt, str);
//        return password;
//    }
//
//    @RequiresPermissions("testPer")
//    @GetMapping("/testPer")
//    public String PermissionTest() {
//        return "你可以看到我";
//    }
//
//    @RequiresRoles("teacher")
//    @GetMapping("/testRole")
//    public String RoleTest() {
//        return "你可以看到我";
//    }
//
//}
