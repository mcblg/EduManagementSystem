package com.blg.edu.mapper;

import com.blg.edu.entity.vo.CollegeInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface CollegeMapper {

    @Select("<script>" +
            "SELECT " +
            " c.*, " +
            " uv.NAME university_name, " +
            " d.NAME department_name, " +
            " u.user_name create_user_name, " +
            " um.name head_name, " +
            " f.name office_room_name " +
            "FROM " +
            " college c " +
            " LEFT JOIN university uv ON uv.id = c.university_id " +
            " LEFT JOIN department d ON d.id = c.department_id " +
            " LEFT JOIN USER u ON u.id = c.create_user_id " +
            " LEFT JOIN user_info_main um on um.user_id = c.head " +
            " LEFT JOIN field f on f.id = c.office_room " +
            "<if test='universityId != null and universityId != \"\"'>" +
            " WHERE c.university_id = #{universityId}" +
            "</if>" +
            "</script>")
    List<CollegeInfoVo> getCollegeList(String universityId);
}
