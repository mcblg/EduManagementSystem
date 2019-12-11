package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@ToString
@Data
public class User {
    private Long id;

    private String userName;

    private String pwd;

    private String salt;

    private Integer status;

    private Date createTime;

    private Set<String> roles = new HashSet<>();

    private Set<String> permissions = new HashSet<>();

}