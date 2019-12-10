package com.blg.edu.mapper;

import com.blg.edu.entity.University;

public interface UniversityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(University record);

    int insertSelective(University record);

    University selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(University record);

    int updateByPrimaryKey(University record);
}