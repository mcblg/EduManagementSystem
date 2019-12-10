package com.blg.edu.mapper;

import com.blg.edu.entity.FieldIncharge;

public interface FieldInchargeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FieldIncharge record);

    int insertSelective(FieldIncharge record);

    FieldIncharge selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FieldIncharge record);

    int updateByPrimaryKey(FieldIncharge record);
}