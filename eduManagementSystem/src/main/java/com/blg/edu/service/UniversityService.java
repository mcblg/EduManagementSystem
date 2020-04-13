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

    List<UniversityInfoVo> getUniversityInfoList();
}
