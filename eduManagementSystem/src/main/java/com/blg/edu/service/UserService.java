package com.blg.edu.service;

import com.blg.edu.entity.User;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */
public interface UserService {

    /**
     * @Author: huangdong on 2019/12/11
     * @params: [userName]
     * @return: com.blg.edu.entity.User
     * @Description: 〈根据用户名获取用户〉
     */
    User getUserByUserName(String userName);
}
