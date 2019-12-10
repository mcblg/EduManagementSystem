package com.blg.edu.mapper;

import com.blg.edu.entity.FieldDepartment;

public interface FieldDepartmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FieldDepartment record);

    int insertSelective(FieldDepartment record);

    FieldDepartment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FieldDepartment record);

    int updateByPrimaryKey(FieldDepartment record);
}