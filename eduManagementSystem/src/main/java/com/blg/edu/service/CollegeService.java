package com.blg.edu.service;

import com.blg.edu.entity.vo.CollegeInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface CollegeService {

    List<CollegeInfoVo> getCollegeInfo(String universityId);
}
