package com.blg.edu.service;

import com.blg.edu.entity.University;
import com.blg.edu.entity.vo.UniversityInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-08
 */
public interface UniversityService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.vo.UniversityInfoVo>
     * @Description: 〈学校列表〉
     */
    List<UniversityInfoVo> getUniversityInfoList();
}
