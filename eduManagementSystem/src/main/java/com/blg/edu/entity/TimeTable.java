package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@ToString
@Data
public class TimeTable {
    private String id;

    private String universityId;

    private String name;

    private String period;

    private Date createTime;

    private String createUserId;

    private String status;

}