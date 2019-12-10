package com.blg.edu.mapper;

import com.blg.edu.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") Long id);
}