package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class FieldType {
    private String id;

    private String universityId;

    private String name;

    private Date createTime;

    private String createUserId;

    private Integer status;
}