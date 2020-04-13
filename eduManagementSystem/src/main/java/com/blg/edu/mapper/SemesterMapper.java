package com.blg.edu.mapper;

import com.blg.edu.entity.vo.SemesterInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SemesterMapper {
   
    @Select("<script>" +
            "SELECT " +
            " s.*, " +
            " uv.NAME university_name, " +
            " u.user_name create_user_name  " +
            "FROM " +
            " semester s " +
            " LEFT JOIN university uv ON uv.id = s.university_id " +
            " LEFT JOIN USER u ON u.id = s.create_user_id " +
            "<if test='universityId != null and universityId != \"\"'>" +
            " WHERE s.university_id = #{universityId}" +
            "</if>" +
            "</script>")
    List<SemesterInfoVo> getSemesterList(String universityId);
}