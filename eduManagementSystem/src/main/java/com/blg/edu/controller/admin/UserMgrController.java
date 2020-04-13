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

    @GetMapping("/userMgr")
    public String userMgr() {
        return "/pages/admin/userMgr";
    }

    @GetMapping("/userList")
    @ResponseBody
    public ResponseEntity<AjaxResponse<List<UserInfoVo>>> getUserList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<UserInfoVo> list = userService.getUserListByUniversity(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), list));
    }

    @PostMapping("/userRoleAdd")
    @ResponseBody
    public ResponseEntity<AjaxResponse<String>> userRoleAdd(@RequestBody UserRole userRole, HttpServletRequest request) {
        userService.userRoleAdd(userRole);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), ""));
    }

    @PostMapping("/userRoleDelete")
    @ResponseBody
    public ResponseEntity<AjaxResponse<String>> userRoleDelete(@RequestBody UserRole userRole, HttpServletRequest request) {
        userService.userRoleDelete(userRole);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), ""));
    }
}
