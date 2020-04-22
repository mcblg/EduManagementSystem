package com.blg.edu.service;

import com.blg.edu.entity.vo.VacationInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface VacationService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.VacationInfoVo>
     * @Description: 〈假期列表〉
     */
    List<VacationInfoVo> getVacationList(String universityId);
}
