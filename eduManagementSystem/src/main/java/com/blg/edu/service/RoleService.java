package com.blg.edu.service;

import com.blg.edu.entity.Role;
import com.blg.edu.entity.vo.RoleInfoVo;

import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2019-12-10
 */
public interface RoleService {

    /**
     * @Author: chenjiahao on 2019/12/10
     * @params: []
     * @return: com.blg.edu.entity.Role
     * @Description: 〈根据id获取角色〉
     */
    Role getRoleById(String id);

    /**
     * @Author: chenjiahao on 2019/12/10
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Role>
     * @Description: 〈根据用户id获取角色〉
     */
    Set<Role> getRoleByUserId(String userId);

    /**
     * @Author: chenjiahao on 2019/12/11
     * @params: [userId]
     * @return: java.util.Set<java.lang.String>
     * @Description: 〈根据用户id获取角色code〉
     */
    Set<String> getRoleCodeByUserId(String userId);

    /**
     * @Author: chenjiahao on 2020/4/4
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.RoleInfoVo>
     * @Description: 〈获取角色信息列表〉
     */
    List<RoleInfoVo> getRoleInfoList(String universityId);

    void rolePermConfig(String roleId, List<String> permIds);
}
