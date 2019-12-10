package com.blg.edu.mapper;

import com.blg.edu.entity.Field;

public interface FieldMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Field record);

    int insertSelective(Field record);

    Field selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Field record);

    int updateByPrimaryKey(Field record);
}