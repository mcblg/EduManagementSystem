package com.blg.edu.entity.vo;

import com.blg.edu.entity.Position;
import lombok.Data;
import lombok.ToString;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@ToString
@Data
public class PositionInfoVo extends Position {

    private String universityName;
    private String createUserName;
}
