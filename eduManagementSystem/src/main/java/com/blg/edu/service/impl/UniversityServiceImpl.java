package com.blg.edu.service.impl;

import com.blg.edu.entity.University;
import com.blg.edu.entity.vo.UniversityInfoVo;
import com.blg.edu.mapper.UniversityMapper;
import com.blg.edu.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-08
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    UniversityMapper universityMapper;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.util.List<com.blg.edu.entity.vo.UniversityInfoVo>
     * @Description: 〈学校列表〉
     */
    @Override
    public List<UniversityInfoVo> getUniversityInfoList() {
        return universityMapper.getUniversityInfoList();
    }
}
