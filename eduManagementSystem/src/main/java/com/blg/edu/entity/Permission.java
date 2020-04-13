package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@ToString
@Data
public class Permission {

    private String id;

    private String name;

    private String url;

    private Integer status;

    private String perCode;

    private Integer perType;

    private Date createTime;

    private String createUser;

    private Integer level;

    private String parentId;

    public Permission() {
    }

    public Permission(String name, String url, Integer status, String perCode, Integer perType, Date createTime, String createUser, Integer level, String parentId) {
        this.name = name;
        this.url = url;
        this.status = status;
        this.perCode = perCode;
        this.perType = perType;
        this.createTime = createTime;
        this.createUser = createUser;
        this.level = level;
        this.parentId = parentId;
    }
}