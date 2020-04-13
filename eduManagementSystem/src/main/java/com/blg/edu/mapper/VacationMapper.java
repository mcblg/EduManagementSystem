package com.blg.edu.mapper;

import com.blg.edu.entity.vo.VacationInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface VacationMapper {
    
    @Select("<script>" +
            "SELECT " +
            " v.*, " +
            " s.NAME semester_name, " +
            " uv.NAME university_name, " +
            " u.user_name create_user_name  " +
            "FROM " +
            " vacation v " +
            " LEFT JOIN semester s ON s.id = v.semester_id " +
            " LEFT JOIN university uv ON uv.id = v.university_id " +
            " LEFT JOIN USER u ON u.id = v.create_user_id" +
            "<if test='universityId != null and universityId != \"\"'>" +
            " WHERE v.university_id = #{universityId}" +
            "</if>" +
            "</script>")
    List<VacationInfoVo> getVacationList(String universityId);
}
