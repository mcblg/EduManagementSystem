package com.blg.edu.mapper;

import com.blg.edu.entity.Canlendar;

public interface CanlendarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Canlendar record);

    int insertSelective(Canlendar record);

    Canlendar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Canlendar record);

    int updateByPrimaryKey(Canlendar record);
}