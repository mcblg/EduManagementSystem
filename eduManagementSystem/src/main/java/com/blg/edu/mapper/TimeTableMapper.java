package com.blg.edu.mapper;

import com.blg.edu.entity.vo.TimeTableInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TimeTableMapper {
    
    @Select("<script>" +
            "SELECT " +
            " t.*, " +
            " uv.NAME university_name, " +
            " u.user_name create_user_name  " +
            "FROM " +
            " time_table t " +
            " LEFT JOIN university uv ON uv.id = t.university_id " +
            " LEFT JOIN USER u ON u.id = t.create_user_id " +
            "<if test='universityId != null and universityId != \"\"'>" +
            " WHERE t.university_id = #{universityId}" +
            "</if>" +
            "</script>")
    List<TimeTableInfoVo> getTimeTableList(String universityId);
}