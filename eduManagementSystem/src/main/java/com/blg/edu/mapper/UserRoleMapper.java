package com.blg.edu.mapper;

import com.blg.edu.entity.UserRole;
import org.apache.ibatis.annotations.*;

public interface UserRoleMapper {

    @SelectKey(keyProperty = "userRole.id", resultType = String.class, before = true, statement = "select replace(uuid(), '-', '')")
    @Options(keyProperty = "userRole.id", useGeneratedKeys = true)
    @Insert("INSERT INTO user_role " +
            "VALUES " +
            " ( #{userRole.id}, #{userRole.userId}, #{userRole.roleId} )")
    void insertUserRole(@Param("userRole") UserRole userRole);

    @Delete("DELETE  " +
            "FROM " +
            " user_role  " +
            "WHERE " +
            " user_id =  #{userRole.userId} " +
            " AND role_id = #{userRole.roleId }")
    void deleteUserRole(@Param("userRole") UserRole userRole);
}