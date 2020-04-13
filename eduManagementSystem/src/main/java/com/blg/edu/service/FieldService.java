package com.blg.edu.service;

import com.blg.edu.entity.vo.FieldInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
public interface FieldService {

    List<FieldInfoVo> getFieldInfoList(String universityId);
}
