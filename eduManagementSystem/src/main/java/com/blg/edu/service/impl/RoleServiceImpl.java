package com.blg.edu.service.impl;

import com.blg.edu.entity.Role;
import com.blg.edu.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleServiceImpl implements RoleService {
    /**
     * @Author: huangdong on 2019/12/10
     * @params: []
     * @return: com.blg.edu.entity.Role
     * @Description: 〈根据id获取角色〉
     */
    @Override
    public Role getRoleById(Long id) {
        return null;
    }

    /**
     * @Author: huangdong on 2019/12/10
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.Role>
     * @Description: 〈根据用户id获取角色〉
     */
    @Override
    public List<Role> getRoleByUserId(Long userId) {
        return null;
    }
}
