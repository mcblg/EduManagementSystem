package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class Area {
    private String id;

    private String name;

    private String universityId;

    private Date createTime;

    private String createUserId;

    private Integer status;
}