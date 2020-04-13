package com.blg.edu.mapper;

import com.blg.edu.entity.Role;
import com.blg.edu.entity.vo.RoleInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

public interface RoleMapper {

    @Select("SELECT" +
            "	r.role_code " +
            "FROM" +
            "	role r," +
            "	user_role ur " +
            "WHERE" +
            "   r.status = 0" +
            "	AND r.id = ur.role_id " +
            "	AND ur.user_id = #{userId}")
    Set<String> getAllRoleCode(@Param("userId") String userId);

    @Select("SELECT" +
            "	r.* " +
            "FROM" +
            "	role r," +
            "	user_role ur " +
            "WHERE" +
            "   r.status = 0" +
            "	AND r.id = ur.role_id " +
            "	AND ur.user_id = #{userId}")
    Set<Role> getAllRole(@Param("userId") String userId);


    @Select("<script>" +
            "SELECT " +
            " r.*, " +
            " u.NAME u_name, " +
            " us.user_name create_user_name " +
            "FROM " +
            " role r " +
            " LEFT JOIN university u ON u.id = r.university_id " +
            " LEFT JOIN user us on us.id = r.create_user " +
            "<if test='universityId != null and universityId != \"\"'>" +
            "WHERE r.university_id = #{universityId} " +
            "</if>" +
            "</script>")
    List<RoleInfoVo> getRoleList(String universityId);
}