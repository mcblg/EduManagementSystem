package com.blg.edu.mapper;

import com.blg.edu.entity.RolePermission;
import org.apache.ibatis.annotations.*;

public interface RolePermissionMapper {

    @Delete("DELETE  " +
            "FROM " +
            " role_permission  " +
            "WHERE " +
            " role_id = #{roleId}")
    void deleteRolePermByRoleId(String roleId);

    @SelectKey(keyProperty = "rolePerm.id", resultType = String.class, before = true, statement = "select replace(uuid(), '-', '')")
    @Options(keyProperty = "rolePerm.id", useGeneratedKeys = true)
    @Insert("INSERT INTO role_permission " +
            "VALUES " +
            " ( #{rolePerm.id}, #{rolePerm.roleId}, #{rolePerm.permissionId} )")
    void addRolePerm(@Param("rolePerm") RolePermission rolePerm);
}