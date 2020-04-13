package com.blg.edu.entity.vo;

import com.blg.edu.entity.Department;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-10
 */
@Data
@ToString
public class DepartmentInfoVo extends Department {

    private String headName;
    private String officeRoomName;
    private String universityLeaderName;
    private String universityName;
}
