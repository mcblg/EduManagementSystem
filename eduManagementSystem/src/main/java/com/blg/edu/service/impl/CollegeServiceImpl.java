package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.CollegeInfoVo;
import com.blg.edu.mapper.CollegeMapper;
import com.blg.edu.service.CollegeService;
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
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    CollegeMapper collegeMapper;

    @Override
    public List<CollegeInfoVo> getCollegeInfo(String universityId) {
        return collegeMapper.getCollegeList(universityId);
    }
}
