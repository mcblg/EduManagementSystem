package com.blg.edu.mapper;

import com.blg.edu.entity.Department;
import com.blg.edu.entity.vo.DepartmentInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DepartmentMapper {

    @Select("<script>" +
            "SELECT " +
            " d.*, " +
            " um1.NAME head_name, " +
            " f.NAME office_room_name, " +
            " um2.NAME university_leader_name, " +
            " u.name university_name " +
            "FROM " +
            " department d " +
            " LEFT JOIN user_info_main um1 ON um1.user_id = d.head " +
            " LEFT JOIN field f ON f.id = d.office_room " +
            " LEFT JOIN user_info_main um2 ON um2.user_id = d.university_leader " +
            " LEFT JOIN university u on u.id = d.university_id " +
            "<if test='universityId != null and universityId != \"\"'>" +
            "WHERE d.university_id = #{universityId} " +
            "</if>" +
            "</script>")
    List<DepartmentInfoVo> getDepartmentList(String universityId);
}