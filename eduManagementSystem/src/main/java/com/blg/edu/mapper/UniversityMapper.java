package com.blg.edu.mapper;

import com.blg.edu.entity.University;
import com.blg.edu.entity.vo.UniversityInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UniversityMapper {

    @Select("SELECT " +
            " u.*, " +
            " us.user_name create_user_name  " +
            "FROM " +
            " university u " +
            " LEFT JOIN USER us ON us.id = u.create_user_id")
    List<UniversityInfoVo> getUniversityInfoList();
}