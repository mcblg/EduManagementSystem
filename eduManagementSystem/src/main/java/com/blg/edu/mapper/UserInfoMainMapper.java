package com.blg.edu.mapper;

import com.blg.edu.entity.UserInfoMain;

public interface UserInfoMainMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfoMain record);

    int insertSelective(UserInfoMain record);

    UserInfoMain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfoMain record);

    int updateByPrimaryKey(UserInfoMain record);
}