package com.blg.edu.mapper;

import com.blg.edu.entity.vo.ClazzInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface ClazzMapper {
    
    @Select("<script>" +
            "SELECT " +
            " c.*, " +
            " uv.NAME university_name, " +
            " d.NAME department_name, " +
            " co.NAME college_name, " +
            " um.NAME headteacher_name, " +
            " u.user_name create_user_name  " +
            "FROM " +
            " clazz c " +
            " LEFT JOIN university uv ON uv.id = c.university_id " +
            " LEFT JOIN department d ON d.id = c.department_id " +
            " LEFT JOIN college co ON co.id = c.college_id " +
            " LEFT JOIN user_info_main um ON um.user_id = c.headteacher " +
            " LEFT JOIN USER u ON u.id = c.create_user_id " +
            "<if test='universityId != null and universityId != \"\"'>" +
            " WHERE c.university_id = #{universityId} " +
            "</if>" +
            "</script>")
    List<ClazzInfoVo> getClazzList(String universityId);
}
