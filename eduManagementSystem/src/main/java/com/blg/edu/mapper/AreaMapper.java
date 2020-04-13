package com.blg.edu.mapper;

import com.blg.edu.entity.Area;
import com.blg.edu.entity.vo.AreaInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AreaMapper {

    @Select("<script>" +
            "SELECT " +
            " a.*, " +
            " uv.NAME university_name, " +
            " u.user_name create_user_name  " +
            "FROM " +
            " area a " +
            " LEFT JOIN university uv ON uv.id = a.university_id " +
            " LEFT JOIN USER u ON u.id = a.create_user_id " +
            "<if test='universityId != null and universityId != \"\"'>" +
            " WHERE a.university_id = #{universityId} " +
            "</if>" +
            "</script>")
    List<AreaInfoVo> getAreaInfoList(String universityId);
}