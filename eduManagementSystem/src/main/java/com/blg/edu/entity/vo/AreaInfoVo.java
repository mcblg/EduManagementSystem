package com.blg.edu.entity.vo;

import com.blg.edu.entity.Area;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
@Data
@ToString
public class AreaInfoVo extends Area {

    private String universityName;
    private String createUserName;
}
