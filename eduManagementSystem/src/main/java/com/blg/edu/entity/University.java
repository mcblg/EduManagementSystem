package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class University {
    private String id;

    private String name;

    private String ename;

    private Integer status;

    private String tel;

    private String address;

    private Date createTime;

    private String createUserId;
}