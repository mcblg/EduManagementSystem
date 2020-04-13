package com.blg.edu.mapper;

import com.blg.edu.entity.FieldType;
import com.blg.edu.entity.vo.FieldTypeInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FieldTypeMapper {

    @Select("<script>" +
            "SELECT " +
            " ft.*, " +
            " uv.NAME universityName, " +
            " u.user_name create_user_name  " +
            "FROM " +
            " field_type ft " +
            " LEFT JOIN university uv ON uv.id = ft.university_id " +
            " LEFT JOIN USER u ON u.id = ft.create_user_id " +
            "<if test='universityId != null and universityId != \"\"'>" +
            "WHERE ft.university_id = #{universityId} " +
            "</if>" +
            "</script>")
    List<FieldTypeInfoVo> getFieldTypeList(String universityId);
}