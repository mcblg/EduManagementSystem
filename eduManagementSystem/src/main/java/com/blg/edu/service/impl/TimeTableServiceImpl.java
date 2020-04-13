package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.TimeTableInfoVo;
import com.blg.edu.mapper.TimeTableMapper;
import com.blg.edu.service.TimeTableService;
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
public class TimeTableServiceImpl implements TimeTableService {

    @Autowired
    TimeTableMapper timeTableMapper;

    @Override
    public List<TimeTableInfoVo> getTimeTableList(String universityId) {
        return timeTableMapper.getTimeTableList(universityId);
    }
}
