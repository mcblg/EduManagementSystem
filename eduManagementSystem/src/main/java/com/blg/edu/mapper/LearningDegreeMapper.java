package com.blg.edu.mapper;

import com.blg.edu.entity.LearningDegree;

public interface LearningDegreeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LearningDegree record);

    int insertSelective(LearningDegree record);

    LearningDegree selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LearningDegree record);

    int updateByPrimaryKey(LearningDegree record);
}