package com.blg.edu.entity.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-01
 */
@Data
@ToString
public class UserInfoVo {

    private String id;
    private String userName;
    private String name;
    private String university;
    private Integer userType;
    private Integer userStatus;
    private Date createTime;
    private String createUser;
}
