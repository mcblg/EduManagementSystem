package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Data
@ToString
public class Employee {

    private String id;

    private String userInfoMainId;

    private String universityId;

    private String empNo;

    private String collegeId;

    private String departmentId;

    private Date beginTeachDate;

    private Date endTeachDate;

    private String majorId;

    private String title;

    private String positionId;

    private Date createTime;

    private String createUser;

    private Integer status;
    
}