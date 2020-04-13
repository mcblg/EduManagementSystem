package com.blg.edu.controller.admin;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.Role;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.RoleInfoVo;
import com.blg.edu.service.RoleService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-04
 */
@Controller
public class RoleMgrController {

    @Autowired
    RoleService roleService;

    @GetMapping("/roleMgr")
    public String roleMgr() {
        return "/pages/admin/roleMgr";
    }

    @GetMapping("/roleInfoList")
    @ResponseBody
    public ResponseEntity<AjaxResponse<List<RoleInfoVo>>> getRoleInfoList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<RoleInfoVo> roleInfoList = roleService.getRoleInfoList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), roleInfoList));

    }

    @GetMapping("/roleList")
    @ResponseBody
    public ResponseEntity<AjaxResponse<Set<Role>>> getRoleListByUserId(@RequestParam("userId") String userId, HttpServletRequest request) {
        Set<Role> roles = roleService.getRoleByUserId(userId);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), roles));
    }

    @PostMapping("/rolePermConfig")
    @ResponseBody
    public ResponseEntity<AjaxResponse<String>> rolePermConfig(@RequestParam("roleId") String roleId, @RequestParam("permIds[]") List<String> permIds, HttpServletRequest request) {
        roleService.rolePermConfig(roleId, permIds);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), ""));
    }

}
