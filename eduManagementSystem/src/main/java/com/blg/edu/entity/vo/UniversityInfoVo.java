package com.blg.edu.entity.vo;

import com.blg.edu.entity.University;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-08
 */
@Data
@ToString
public class UniversityInfoVo extends University {

    private String createUserName;
}
