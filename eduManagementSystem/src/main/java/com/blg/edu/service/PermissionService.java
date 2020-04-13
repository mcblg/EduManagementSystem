package com.blg.edu.service;

import com.blg.edu.entity.Permission;
import com.blg.edu.entity.vo.PermissionInfoVo;

import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2019-12-10
 */

public interface PermissionService {

    /**
     * @Author: chenjiahao on 2019/12/10
     * @params: []
     * @return: com.blg.edu.entity.Permission
     * @Description: 〈根据id获取权限〉
     */
    Permission getPermissionById(String id);

    List<Permission> getPermissionByPerCode(String perCode);

    /**
     * @Author: chenjiahao on 2019/12/10
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈根据角色id获取权限〉
     */
    List<Permission> getPermissionByRoleId(String roleId);

    /**
     * @Author: chenjiahao on 2019/12/10
     * @params: [userId]
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈根据用户id获取权限〉
     */
    Set<Permission> getPermissionByUserId(String userId);

    /**
     * @Author: chenjiahao on 2019/12/11
     * @params: [userId]
     * @return: java.util.Set<java.lang.String>
     * @Description: 〈根据用户id获取权限code〉
     */
    Set<String> getPerCodeByUserId(String userId);

    /**
     * @Author: chenjiahao on 2020/4/7
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈获取所有权限〉
     */
    List<PermissionInfoVo> getPermissionList();

    List<Permission> getParentPerm();

    void addPermission(String name, String perCode, String url, Integer type, String parent);
}
