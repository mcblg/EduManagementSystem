package com.blg.edu.service;

import com.blg.edu.entity.Permission;

import java.util.List;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */

public interface PermissionService {

    /**
     * @Author: huangdong on 2019/12/10
     * @params: []
     * @return: com.blg.edu.entity.Permission
     * @Description: 〈根据id获取权限〉
     */
    Permission getPermissionById(Long id);

    /**
     * @Author: huangdong on 2019/12/10
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈根据角色id获取权限〉
     */
    List<Permission> getPermisonByRoleId(Long roleId);

    /**
     * @Author: huangdong on 2019/12/10
     * @params: [userId]
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈根据用户id获取权限〉
     */
    List<Permission> getPermissionByUserId(Long userId);
}
