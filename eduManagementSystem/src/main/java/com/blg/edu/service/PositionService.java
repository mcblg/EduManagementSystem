package com.blg.edu.service;

import com.blg.edu.entity.vo.PositionInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface PositionService {

    List<PositionInfoVo> getPositionList(String universityId);
}
