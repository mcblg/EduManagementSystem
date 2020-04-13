package com.blg.edu.service;

import com.blg.edu.entity.vo.TimeTableInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface TimeTableService {

    List<TimeTableInfoVo> getTimeTableList(String universityId);
}
