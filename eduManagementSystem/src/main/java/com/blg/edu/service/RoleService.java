package com.blg.edu.service;

import com.blg.edu.entity.Role;

import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */
public interface RoleService {

    /**
     * @Author: huangdong on 2019/12/10
     * @params: []
     * @return: com.blg.edu.entity.Role
     * @Description: 〈根据id获取角色〉
     */
    Role getRoleById(Long id);

    /**
     * @Author: huangdong on 2019/12/10
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Role>
     * @Description: 〈根据用户id获取角色〉
     */
    List<Role> getRoleByUserId(Long userId);

    /**
     * @Author: huangdong on 2019/12/11
     * @params: [userId]
     * @return: java.util.Set<java.lang.String>
     * @Description: 〈根据用户id获取角色code〉
     */
    Set<String> getRoleCodeByUserId(Long userId);
}
