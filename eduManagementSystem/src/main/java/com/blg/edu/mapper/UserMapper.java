package com.blg.edu.mapper;

import com.blg.edu.entity.User;
import com.blg.edu.entity.vo.UserInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") String id);

    @Select("select * from user where user_name = #{userName}")
    List<User> getUserByUserName(@Param("userName") String userName);

    @Select("<script>" +
            "SELECT " +
            " u.id, " +
            " u.user_name, " +
            " i.NAME, " +
            " uv.NAME university, " +
            " i.user_type, " +
            " i.STATUS user_status,  " +
            " u.create_time, " +
            " u1.user_name create_user " +
            "FROM " +
            " user u " +
            " LEFT JOIN university uv ON uv.id = u.university_id " +
            " LEFT JOIN user_info_main i ON i.user_id = u.id " +
            " LEFT JOIN user u1 on u1.id = u.create_user" +
            "<if test='universityId != null and universityId != \"\"'>" +
            " WHERE u.university_id = #{universityId} " +
            "</if>" +
            "</script>")
    List<UserInfoVo> getUserListByUniversity(String universityId);
}