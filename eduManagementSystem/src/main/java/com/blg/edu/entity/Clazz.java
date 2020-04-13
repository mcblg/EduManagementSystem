package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@ToString
@Data
public class Clazz {

    private String id;
    private String universityId;
    private String departmentId;
    private String collegeId;
    private String name;
    private String englishName;
    private String headteacher;
    private String createUserId;
    private Date createTime;
    private Integer status;
}
