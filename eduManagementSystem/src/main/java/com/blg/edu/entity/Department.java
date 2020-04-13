package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@ToString
@Data
public class Department {
    private String id;

    private String universityId;

    private String name;

    private String englishName;

    private String head;

    private String officeRoom;

    private String universityLeader;

    private String telephone;

    private Date createTime;

    private String createUserId;

    private Integer status;
}