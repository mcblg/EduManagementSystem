package com.blg.edu.controller.admin;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.Permission;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.PermissionInfoVo;
import com.blg.edu.service.PermissionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
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
 * @create: 2020-04-07
 */
@Controller
public class PermissionMgrController {

    @Autowired
    PermissionService permissionService;

    @RequiresPermissions("permMgr")
    @GetMapping("/permMgr")
    public String permMgr() {
        return "/pages/admin/permMgr";
    }

    @GetMapping("/permInfoList")
    @ResponseBody
    public ResponseEntity<AjaxResponse<List<PermissionInfoVo>>> getPermINfoList(HttpServletRequest request) {
        List<PermissionInfoVo> list = permissionService.getPermissionList();
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), list));
    }

    @GetMapping("/permList")
    @ResponseBody
    public ResponseEntity<AjaxResponse<List<Permission>>> getPermList(@RequestParam("roleId") String roleId, HttpServletRequest request) {
        List<Permission> list = permissionService.getPermissionByRoleId(roleId);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), list));
    }

    @GetMapping("/getParentPerm")
    @ResponseBody
    public ResponseEntity<AjaxResponse<List<Permission>>> getParentPerm(HttpServletRequest request) {
        List<Permission> parentPerm = permissionService.getParentPerm();
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), parentPerm));
    }

    @PostMapping("/addPerm")
    @ResponseBody
    public ResponseEntity<AjaxResponse<String>> addPermission(String name, String perCode, String url, Integer type, String parent, HttpServletRequest request) {
        permissionService.addPermission(name, perCode, url, type, parent);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), ""));
    }

    @PostMapping("/validatePerCode")
    @ResponseBody
    public Boolean validatePerCode(String perCode) {
        List<Permission> permissions = permissionService.getPermissionByPerCode(perCode);
        if (permissions.size() > 0) {
            return false;
        }else {
            return true;
        }
    }

    @GetMapping("/getPermissionById")
    @ResponseBody
    public ResponseEntity<AjaxResponse<PermissionInfoVo>> getPermissionById(String permId, HttpServletRequest request) {
        PermissionInfoVo perm = permissionService.getPermissionById(permId);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), perm));
    }

    @PostMapping("/editPermission")
    @ResponseBody
    public ResponseEntity<AjaxResponse<String>> editPermission(String permId, String name, String perCode, String url, Integer type, String parent, HttpServletRequest request) {
        permissionService.editPermission(permId, name, perCode, url, type, parent);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), ""));
    }

    @PostMapping("/PermLockOrUnLock")
    @ResponseBody
    public ResponseEntity<AjaxResponse<String>> LockOrUnlock(String permId, Integer status, HttpServletRequest request) {
        permissionService.lockOrUnlock(permId, status);
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), ""));
    }

    @GetMapping("/getMenu")
    @ResponseBody
    public ResponseEntity<AjaxResponse<Set<Permission>>> getMenu(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        Set<Permission> menu = permissionService.getMenu(user.getId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), menu));
    }
}
