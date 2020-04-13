package com.blg.edu.service.impl;

import com.blg.edu.entity.User;
import com.blg.edu.entity.UserRole;
import com.blg.edu.entity.vo.UserInfoVo;
import com.blg.edu.mapper.UserMapper;
import com.blg.edu.mapper.UserRoleMapper;
import com.blg.edu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2019-12-10
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserRoleMapper userRoleMapper;
    /**
     * @Author: chenjiahao on 2019/12/11
     * @params: [userName]
     * @return: com.blg.edu.entity.User
     * @Description: 〈根据用户名获取用户〉
     */
    @Override
    public User getUserByUserName(String userName) {
        List<User> list = userMapper.getUserByUserName(userName);
        if (list != null && list.size() != 0) {
            return list.get(0);
        }
        return null;
    }

    /**
     * @param universityId
     * @Author: chenjiahao on 2020/4/1
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.User>
     * @Description: 〈根据学校id返回用户列表〉
     */
    @Override
    public List<UserInfoVo> getUserListByUniversity(String universityId) {
        return userMapper.getUserListByUniversity(universityId);
    }

    @Override
    public void userRoleAdd(UserRole userRole) {
        userRoleMapper.insertUserRole(userRole);
    }

    @Override
    public void userRoleDelete(UserRole userRole) {
        userRoleMapper.deleteUserRole(userRole);
    }


}
