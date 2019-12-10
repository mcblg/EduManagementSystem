package com.blg.edu.mapper;

import com.blg.edu.entity.TimeTable;

public interface TimeTableMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TimeTable record);

    int insertSelective(TimeTable record);

    TimeTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TimeTable record);

    int updateByPrimaryKey(TimeTable record);
}