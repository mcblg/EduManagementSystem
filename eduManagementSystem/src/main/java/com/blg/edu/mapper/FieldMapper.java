package com.blg.edu.mapper;

import com.blg.edu.entity.Field;
import com.blg.edu.entity.vo.FieldInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FieldMapper {

    @Select("<script>" +
            "SELECT " +
            " f.*, " +
            " uv.NAME university_name, " +
            " a.NAME area_name, " +
            " d.NAME management_name, " +
            " um.NAME administrator_name, " +
            " u.user_name create_user_name, " +
            " ft.name typeName " +
            "FROM " +
            " field f " +
            " LEFT JOIN university uv ON uv.id = f.university_id " +
            " LEFT JOIN area a ON a.id = f.area_id " +
            " LEFT JOIN department d ON d.id = f.management_id " +
            " LEFT JOIN user_info_main um ON um.user_id = f.administrator_id " +
            " LEFT JOIN USER u ON u.id = f.create_user_id " +
            " LEFT JOIN field_type ft on ft.id = f.type_id " +
            "<if test='universityId != null and universityId != \"\"'>" +
            " WHERE f.university_id = #{universityId} " +
            "</if>" +
            "</script>")
    List<FieldInfoVo> getFieldInfoList(String universityId);
}