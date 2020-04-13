package com.blg.edu.mapper;

import com.blg.edu.entity.UserRelation;

public interface UserRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRelation record);

    int insertSelective(UserRelation record);

    UserRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRelation record);

    int updateByPrimaryKey(UserRelation record);
}