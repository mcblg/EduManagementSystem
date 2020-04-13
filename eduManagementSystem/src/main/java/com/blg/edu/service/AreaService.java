package com.blg.edu.service;

import com.blg.edu.entity.vo.AreaInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
public interface AreaService {

    List<AreaInfoVo> getAreaInfoList(String UniversityId);
}
