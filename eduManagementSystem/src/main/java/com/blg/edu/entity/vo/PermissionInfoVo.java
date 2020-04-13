package com.blg.edu.entity.vo;

import com.blg.edu.entity.Permission;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-07
 */
@Data
@ToString
public class PermissionInfoVo extends Permission {

    private String createUserName;
}
