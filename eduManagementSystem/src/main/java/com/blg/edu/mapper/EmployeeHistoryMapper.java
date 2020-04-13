package com.blg.edu.mapper;

import com.blg.edu.entity.EmployeeHistory;

public interface EmployeeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EmployeeHistory record);

    int insertSelective(EmployeeHistory record);

    EmployeeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmployeeHistory record);

    int updateByPrimaryKey(EmployeeHistory record);
}