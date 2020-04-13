package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@ToString
@Data
public class Semester {
    private String id;

    private String universityId;

    private String name;

    private Date beginTime;

    private Date endTime;

    private Date createTime;

    private String createUserId;

    private Integer status;
}