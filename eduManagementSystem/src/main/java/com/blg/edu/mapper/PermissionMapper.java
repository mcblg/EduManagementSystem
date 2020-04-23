package com.blg.edu.mapper;

import com.blg.edu.entity.Permission;
import com.blg.edu.entity.vo.PermissionInfoVo;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Set;

public interface PermissionMapper {


    @Select("SELECT" +
            "	p.per_code " +
            "FROM" +
            "	permission p," +
            "	role_permission rp," +
            "	user_role ur," +
            "	role r " +
            "WHERE" +
            "	r.id = ur.role_id " +
            "	AND r.STATUS = 0 " +
            "	AND p.STATUS = 0 " +
            "	AND p.id = rp.permission_id " +
            "	AND ur.role_id = rp.role_id " +
            "	AND ur.user_id = #{userId}")
    Set<String> getAllPermissionStr(@Param("userId") String userId);

    @Select("SELECT" +
            "	p.* " +
            "FROM" +
            "	permission p," +
            "	role_permission rp," +
            "	user_role ur," +
            "	role r " +
            "WHERE" +
            "	r.id = ur.role_id " +
            "	AND r.STATUS = 0 " +
            "	AND p.STATUS = 0 " +
            "	AND p.id = rp.permission_id " +
            "	AND ur.role_id = rp.role_id " +
            "	AND ur.user_id = #{userId}")
    Set<Permission> getAllPermission(@Param("userId") String userId);

    @Select("<script>" +
            "SELECT " +
            " p.*, " +
            " u.user_name create_user_name  " +
            "FROM " +
            " permission p " +
            " LEFT JOIN USER u ON u.id = p.create_user " +
            "<if test='status == 0'>" +
            " WHERE p.status = 0" +
            "</if>" +
            "</script>")
    List<PermissionInfoVo> getPermissionList(Integer status);

    @Select("SELECT " +
            " p.*  " +
            "FROM " +
            " permission p, " +
            " role r, " +
            " role_permission rp  " +
            "WHERE " +
            " rp.role_id = r.id  " +
            " AND p.status = 0 " +
            " AND rp.permission_id = p.id  " +
            " AND rp.role_id = #{roleId}")
    List<Permission> getPermissionListByRoleId(String roleId);

    @Select("SELECT " +
            " *  " +
            "FROM " +
            " permission  " +
            "WHERE " +
            " LEVEL = 1")
    List<Permission> getParentPerm();

    @SelectKey(keyProperty = "permission.id", resultType = String.class, before = true, statement = "select replace(uuid(), '-', '')")
    @Options(keyProperty = "permission.id", useGeneratedKeys = true)
    @Insert("INSERT INTO permission " +
            "VALUES " +
            " ( #{permission.id}, #{permission.name}, #{permission.url}, #{permission.status}, #{permission.createTime}, #{permission.createUser}, " +
            " #{permission.perCode}, #{permission.perType}, #{permission.level}, #{permission.parentId} )")
    void addPermission(@Param("permission") Permission permission);

    @Select("select * from permission where per_code = #{perCode}")
    List<Permission> getPermissionByPerCode(String perCode);

    @Select("select p.*,p1.name parent_name from permission p left join permission p1 on p1.id = p.parent_id where p.id = #{id}")
    PermissionInfoVo getPermissionById(String id);

    @Update("update permission set name = #{perm.name}, url = #{perm.url}, per_code = #{perm.perCode}, per_type = #{perm.perType}, level = #{perm.level}, parent_id = #{perm.parentId} " +
            " where id = #{perm.id}")
    void updatePermission(@Param("perm") Permission permission);

    @Update("update permission set status = #{status} where id = #{permId} ")
    void updateStatus(@Param("permId") String permId, @Param("status") Integer status);

    @Select("SELECT" +
            "	p.* " +
            "FROM" +
            "	permission p," +
            "	role_permission rp," +
            "	user_role ur," +
            "	role r " +
            "WHERE" +
            "	r.id = ur.role_id " +
            "	AND r.STATUS = 0 " +
            "	AND p.STATUS = 0 " +
            "	AND p.id = rp.permission_id " +
            "	AND ur.role_id = rp.role_id " +
            "   AND p.per_type = 1" +
            "	AND ur.user_id = #{userId}")
    Set<Permission> getMenu(String userId);
}