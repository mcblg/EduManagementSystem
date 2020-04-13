package com.blg.edu.service.impl;

import com.blg.edu.entity.Role;
import com.blg.edu.entity.RolePermission;
import com.blg.edu.entity.vo.RoleInfoVo;
import com.blg.edu.mapper.RoleMapper;
import com.blg.edu.mapper.RolePermissionMapper;
import com.blg.edu.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;
    @Autowired
    RolePermissionMapper rolePermissionMapper;

    /**
     * @Author: chenjiahao on 2019/12/10
     * @params: []
     * @return: com.blg.edu.entity.Role
     * @Description: 〈根据id获取角色〉
     */
    @Override
    public Role getRoleById(String id) {
        return null;
    }

    /**
     * @Author: chenjiahao on 2019/12/10
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Role>
     * @Description: 〈根据用户id获取角色〉
     */
    @Override
    public Set<Role> getRoleByUserId(String userId) {
        return roleMapper.getAllRole(userId);
    }

    /**
     * @param userId
     * @Author: chenjiahao on 2019/12/11
     * @params: [userId]
     * @return: java.util.Set<java.lang.String>
     * @Description: 〈根据用户id获取角色code〉
     */
    @Override
    public Set<String> getRoleCodeByUserId(String userId) {
        return roleMapper.getAllRoleCode(userId);
    }

    /**
     * @param universityId
     * @Author: chenjiahao on 2020/4/4
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.RoleInfoVo>
     * @Description: 〈获取角色信息列表〉
     */
    @Override
    public List<RoleInfoVo> getRoleInfoList(String universityId) {
        return roleMapper.getRoleList(universityId);
    }

    @Override
    public void rolePermConfig(String roleId, List<String> permIds) {
        //1.删除role_perm中role_id = roleId 的数据
        rolePermissionMapper.deleteRolePermByRoleId(roleId);
        //2.重新添加
        for (String permId : permIds) {
            rolePermissionMapper.addRolePerm(new RolePermission(roleId, permId));
        }
    }
}
