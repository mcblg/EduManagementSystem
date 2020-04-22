package com.blg.edu.controller.admin;

import com.blg.edu.common.exception.SessionAttributeNotExistException;
import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.UserRole;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.UserInfoVo;
import com.blg.edu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-01
 */
@Controller
@Slf4j
public class UserMgrController {

    @Autowired
    UserService userService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈用户管理页面〉
     */
    @RequiresPermissions("userMgr")
    @GetMapping("/userMgr")
    public String userMgr() {
        return "/pages/admin/userMgr";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.UserInfoVo>>>
     * @Description: 〈用户列表〉
     */
    @GetMapping("/userList")
    @ResponseBody
    public ResponseEntity<AjaxResponse<List<UserInfoVo>>> getUserList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<UserInfoVo> list = userService.getUserListByUniversity(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), list));
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [userRole, request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.lang.String>>
     * @Description: 〈用户角色管理--添加角色〉
     */
    @RequiresPermissions("userRoleConfig")
    @PostMapping("/userRoleAdd")
    @ResponseBody
    public ResponseEntity<AjaxResponse<String>> userRoleAdd(@RequestBody UserRole userRole, HttpServletRequest request) {
        userService.userRoleAdd(userRole);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), ""));
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [userRole, request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.lang.String>>
     * @Description: 〈用户角色管理--删除角色〉
     */
    @RequiresPermissions("userRoleConfig")
    @PostMapping("/userRoleDelete")
    @ResponseBody
    public ResponseEntity<AjaxResponse<String>> userRoleDelete(@RequestBody UserRole userRole, HttpServletRequest request) {
        userService.userRoleDelete(userRole);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), ""));
    }
}
