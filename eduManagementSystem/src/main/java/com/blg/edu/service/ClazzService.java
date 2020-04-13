package com.blg.edu.service;

import com.blg.edu.entity.vo.ClazzInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface ClazzService {

    List<ClazzInfoVo> getClazzList(String universityId);
}
