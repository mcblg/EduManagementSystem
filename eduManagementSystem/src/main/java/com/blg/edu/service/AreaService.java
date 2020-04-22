package com.blg.edu.service;

import com.blg.edu.entity.vo.AreaInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
public interface AreaService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [UniversityId]
     * @return: java.util.List<com.blg.edu.entity.vo.AreaInfoVo>
     * @Description: 〈功能区列表〉
     */
    List<AreaInfoVo> getAreaInfoList(String UniversityId);
}
