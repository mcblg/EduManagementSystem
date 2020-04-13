package com.blg.edu.entity.vo;

import com.blg.edu.entity.Field;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
@Data
@ToString
public class FieldInfoVo extends Field {
    private String universityName;
    private String areaName;
    private String managementName;
    private String administratorName;
    private String createUserName;
    private String typeName;
}
