package com.blg.edu.service.impl;

import com.blg.edu.entity.User;
import com.blg.edu.mapper.UserMapper;
import com.blg.edu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    /**
     * @Author: huangdong on 2019/12/11
     * @params: [userName]
     * @return: com.blg.edu.entity.User
     * @Description: 〈根据用户名获取用户〉
     */
    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }
}
