package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.SemesterInfoVo;
import com.blg.edu.mapper.SemesterMapper;
import com.blg.edu.service.SemesterService;
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
public class SemesterServiceImpl implements SemesterService {

    @Autowired
    SemesterMapper semesterMapper;

    @Override
    public List<SemesterInfoVo> getSemesterList(String universityId) {
        return semesterMapper.getSemesterList(universityId);
    }
}
