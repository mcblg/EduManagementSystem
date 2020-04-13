package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class UserInfoMain {
    private String id;

    private String userId;

    private Integer userType;

    private String userName;

    private String identification;

    private Integer sex;

    private Date birthday;

    private String commContent;

    private Integer commType;

    private String country;

    private String province;

    private String city;

    private String addressDetail;

    private String picPath;

    private Date createTime;

    private String createUser;

    private Integer status;


}