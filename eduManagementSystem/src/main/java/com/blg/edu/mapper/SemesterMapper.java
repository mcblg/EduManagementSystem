package com.blg.edu.mapper;

import com.blg.edu.entity.Semester;

public interface SemesterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Semester record);

    int insertSelective(Semester record);

    Semester selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Semester record);

    int updateByPrimaryKey(Semester record);
}