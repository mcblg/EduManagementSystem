package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-10
 */
@ToString
@Data
public class College {

    private String id;
    private String universityId;
    private String departmentId;
    private String name;
    private String englishName;
    private String head;
    private String officeRoom;
    private String telephone;
    private Date createTime;
    private String createUserId;
    private Integer status;
}
