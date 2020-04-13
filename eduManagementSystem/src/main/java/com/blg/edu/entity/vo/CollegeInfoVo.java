package com.blg.edu.entity.vo;

import com.blg.edu.entity.College;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Data
@ToString
public class CollegeInfoVo extends College {

    private String universityName;
    private String departmentName;
    private String createUserName;
    private String headName;
    private String officeRoomName;
}
