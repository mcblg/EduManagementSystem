package com.blg.edu.entity.vo;

import com.blg.edu.entity.Clazz;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@ToString
@Data
public class ClazzInfoVo extends Clazz {

    private String universityName;
    private String departmentName;
    private String collegeName;
    private String headteacherName;
    private String createUserName;
}
