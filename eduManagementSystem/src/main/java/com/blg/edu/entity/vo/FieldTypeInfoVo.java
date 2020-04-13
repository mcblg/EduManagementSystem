package com.blg.edu.entity.vo;

import com.blg.edu.entity.FieldType;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
@ToString
@Data
public class FieldTypeInfoVo extends FieldType {

    private String universityName;
    private String createUserName;

}
