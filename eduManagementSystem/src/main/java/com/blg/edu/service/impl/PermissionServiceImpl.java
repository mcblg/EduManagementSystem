package com.blg.edu.service.impl;

import com.blg.edu.entity.Permission;
import com.blg.edu.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class PermissionServiceImpl implements PermissionService {
    /**
     * @Author: huangdong on 2019/12/10
     * @params: []
     * @return: com.blg.edu.entity.Permission
     * @Description: 〈根据id获取权限〉
     */
    @Override
    public Permission getPermissionById(Long id) {
        return null;
    }

    /**
     * @Author: huangdong on 2019/12/10
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈根据角色id获取权限〉
     */
    @Override
    public List<Permission> getPermisonByRoleId(Long roleId) {
        return null;
    }

    /**
     * @param userId
     * @Author: huangdong on 2019/12/10
     * @params: [userId]
     * @return: java.util.List<com.blg.edu.entity.Permission>
     * @Description: 〈根据用户id获取权限〉
     */
    @Override
    public List<Permission> getPermissionByUserId(Long userId) {
        return null;
    }

    /**
     * @param userId
     * @Author: huangdong on 2019/12/11
     * @params: [userId]
     * @return: java.util.Set<java.lang.String>
     * @Description: 〈根据用户id获取权限code〉
     */
    @Override
    public Set<String> getPerCodeByUserId(Long userId) {
        return null;
    }
}
