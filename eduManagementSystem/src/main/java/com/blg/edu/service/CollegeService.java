package com.blg.edu.service;

import com.blg.edu.entity.vo.CollegeInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface CollegeService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.CollegeInfoVo>
     * @Description: 〈学院列表〉
     */
    List<CollegeInfoVo> getCollegeInfo(String universityId);
}
