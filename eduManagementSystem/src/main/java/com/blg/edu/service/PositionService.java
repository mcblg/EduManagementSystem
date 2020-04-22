package com.blg.edu.service;

import com.blg.edu.entity.vo.PositionInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface PositionService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.PositionInfoVo>
     * @Description: 〈学期列表〉
     */
    List<PositionInfoVo> getPositionList(String universityId);
}
