package com.blg.edu.mapper;

import com.blg.edu.entity.FieldType;

public interface FieldTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FieldType record);

    int insertSelective(FieldType record);

    FieldType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FieldType record);

    int updateByPrimaryKey(FieldType record);
}