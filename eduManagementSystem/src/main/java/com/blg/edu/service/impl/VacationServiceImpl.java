package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.VacationInfoVo;
import com.blg.edu.mapper.VacationMapper;
import com.blg.edu.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class VacationServiceImpl implements VacationService {

    @Autowired
    VacationMapper vacationMapper;

    @Override
    public List<VacationInfoVo> getVacationList(String universityId) {
        return vacationMapper.getVacationList(universityId);
    }
}
