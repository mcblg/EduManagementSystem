package com.blg.edu.service;

import com.blg.edu.entity.vo.VacationInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface VacationService {

    List<VacationInfoVo> getVacationList(String universityId);
}
