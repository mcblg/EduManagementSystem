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
public class Position {

    private String id;
    private String universityId;
    private String name;
    private String englishName;
    private Date createTime;
    private String createUserId;
    private Integer status;
}
