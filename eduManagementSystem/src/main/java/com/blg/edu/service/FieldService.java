package com.blg.edu.service;

import com.blg.edu.entity.vo.FieldInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
public interface FieldService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.FieldInfoVo>
     * @Description: 〈场地列表〉
     */
    List<FieldInfoVo> getFieldInfoList(String universityId);
}
