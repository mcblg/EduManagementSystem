package com.blg.edu.service.impl;

import com.blg.edu.common.enums.UserStatus;
import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.Permission;
import com.blg.edu.entity.User;
import com.blg.edu.entity.vo.PermissionInfoVo;
import com.blg.edu.mapper.PermissionMapper;
import com.blg.edu.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2019-12-10
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    PermissionMapper permissionMapper;

    /**
     * @Author: chenjiahao on 2019/12/10
     * @params: []
     * @return: com.blg.edu.entity.Permission
     * @Description: 〈根据id获取权限〉
     */
    @Override
    public PermissionInfoVo getPermissionById(String id) {
        return permissionMapper.getPermissionById(id);
    }

    @Override
    public List<Permission> getPermissionByPerCode(String perCode) {
        return permissionMapper.getPermissionByPerCode(perCode);
    }

    /**
     * @Author: chenjiahao on 2019/12/10
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈根据角色id获取权限〉
     */
    @Override
    public List<Permission> getPermissionByRoleId(String roleId) {
        return permissionMapper.getPermissionListByRoleId(roleId);
    }

    /**
     * @param userId
     * @Author: chenjiahao on 2019/12/10
     * @params: [userId]
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈根据用户id获取权限〉
     */
    @Override
    public Set<Permission> getPermissionByUserId(String userId) {
        return permissionMapper.getAllPermission(userId);
    }

    /**
     * @param userId
     * @Author: chenjiahao on 2019/12/11
     * @params: [userId]
     * @return: java.util.Set<java.lang.String>
     * @Description: 〈根据用户id获取权限code〉
     */
    @Override
    public Set<String> getPerCodeByUserId(String userId) {
        return permissionMapper.getAllPermissionStr(userId);
    }

    /**
     * @Author: chenjiahao on 2020/4/7
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈获取所有权限〉
     */
    @Override
    public List<PermissionInfoVo> getPermissionList(Integer status) {
        return permissionMapper.getPermissionList(status);
    }

    @Override
    public List<Permission> getParentPerm() {
        return permissionMapper.getParentPerm();
    }

    @Override
    public void addPermission(String name, String perCode, String url, Integer type, String parent) {
        Integer level;
        if (("0").equals(parent)) {
            level = 1;
            parent = "";
        }else {
            level = 2;
        }
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        Permission permission = new Permission(name, url, UserStatus.AVAILABLE.getStatusCode(), perCode, type, new Date(), user.getId(), level, parent);
        permissionMapper.addPermission(permission);
    }

    @Override
    public void editPermission(String permId, String name, String perCode, String url, Integer type, String parent) {
        Integer level;
        if (("0").equals(parent)) {
            level = 1;
            parent = "";
        }else {
            level = 2;
        }
        Permission permission = new Permission(permId, name, url, perCode, type, level, parent);
        permissionMapper.updatePermission(permission);
    }

    @Override
    public void lockOrUnlock(String permId, Integer status) {
        permissionMapper.updateStatus(permId, status);
    }

    @Override
    public Set<Permission> getMenu(String userId) {
        return permissionMapper.getMenu(userId);
    }
}
