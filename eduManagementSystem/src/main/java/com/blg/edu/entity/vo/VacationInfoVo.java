package com.blg.edu.entity.vo;

import com.blg.edu.entity.Vacation;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@ToString
@Data
public class VacationInfoVo extends Vacation {

    private String universityName;
    private String createUserName;
    private String semesterName;
}
