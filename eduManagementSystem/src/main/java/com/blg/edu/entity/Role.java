package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@ToString
@Data
public class Role {
    private String id;

    private String universityId;

    private String name;

    private String description;

    private Integer status;

    private String roleCode;

    private Date createTime;

    private String createUser;

}