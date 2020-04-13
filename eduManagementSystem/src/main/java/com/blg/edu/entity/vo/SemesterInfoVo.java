package com.blg.edu.entity.vo;

import com.blg.edu.entity.Semester;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Data
@ToString
public class SemesterInfoVo extends Semester {

    private String universityName;
    private String createUserName;
}
