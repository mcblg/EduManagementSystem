package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Data
@ToString
public class Student {
    private String id;

    private String userInfoMainId;

    private String universityId;

    private String stuNo;

    private Date grade;

    private String majorId;

    private String classId;

    private String liveRoom;

    private Date createTime;

    private String createUser;

    private Integer status;

    private String collegeId;

}