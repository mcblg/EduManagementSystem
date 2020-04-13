package com.blg.edu.entity.vo;

import com.blg.edu.entity.Role;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-04
 */
@Data
@ToString
public class RoleInfoVo extends Role {

    private String uName;
    private String createUserName;
}
