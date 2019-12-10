package com.blg.edu.mapper;

import com.blg.edu.entity.Curriculum;

public interface CurriculumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    Curriculum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);
}