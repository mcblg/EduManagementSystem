package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Data
@ToString
public class Vacation {

    private String id;
    private String universityId;
    private String semesterId;
    private String vacationName;
    private Date beginTime;
    private Date endTime;
    private Integer type;
    private Date createTime;
    private String createUserId;
    private Integer status;
}
