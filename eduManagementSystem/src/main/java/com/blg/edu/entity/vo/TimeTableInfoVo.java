package com.blg.edu.entity.vo;

import com.blg.edu.entity.TimeTable;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@ToString
@Data
public class TimeTableInfoVo extends TimeTable {

    private String universityName;
    private String createUserName;
}
