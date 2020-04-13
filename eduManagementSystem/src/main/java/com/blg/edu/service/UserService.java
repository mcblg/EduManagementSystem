package com.blg.edu.service;

import com.blg.edu.entity.User;
import com.blg.edu.entity.UserRole;
import com.blg.edu.entity.vo.UserInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2019-12-10
 */
public interface UserService {

    /**
     * @Author: chenjiahao on 2019/12/11
     * @params: [userName]
     * @return: com.blg.edu.entity.User
     * @Description: 〈根据用户名获取用户〉
     */
    User getUserByUserName(String userName);

    /**
     * @Author: chenjiahao on 2020/4/1
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.User>
     * @Description: 〈根据学校id返回用户列表〉
     */
    List<UserInfoVo> getUserListByUniversity(String universityId);

    void userRoleAdd(UserRole userRole);

    void userRoleDelete(UserRole userRole);
}
