package com.blg.edu.mapper;

import com.blg.edu.entity.vo.PositionInfoVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface PositionMapper {
    
    @Select("<script>" +
            "SELECT " +
            " p.*, " +
            " uv.NAME university_name, " +
            " u.user_name create_user_name  " +
            "FROM " +
            " position p " +
            " LEFT JOIN university uv ON uv.id = p.university_id " +
            " LEFT JOIN USER u ON u.id = p.create_user_id" +
            "<if test='universityId != null and universityId != \"\"'>" +
            " WHERE p.university_id = #{universityId}" +
            "</if>" +
            "</script>")
    List<PositionInfoVo> getPositionList(String universityId);

}
