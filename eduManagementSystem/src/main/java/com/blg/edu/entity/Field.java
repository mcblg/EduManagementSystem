package com.blg.edu.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@Data
@ToString
public class Field {
    private String id;

    private String name;

    private String universityId;

    private String areaId;

    private String floor;

    private String room;

    private Double length;

    private Double width;

    private Double height;

    private Integer maxVolumn;

    private String managementId;

    private String administratorId;

    private Date chargeBeginTime;

    private Date chargeEndTime;

    private String typeId;

    private Integer inOutDoor;

    private Date createTime;

    private String createUserId;

    private Integer status;
}