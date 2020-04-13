package com.blg.edu.mapper;

import com.blg.edu.entity.Ecomm;

public interface EcommMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ecomm record);

    int insertSelective(Ecomm record);

    Ecomm selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ecomm record);

    int updateByPrimaryKey(Ecomm record);
}