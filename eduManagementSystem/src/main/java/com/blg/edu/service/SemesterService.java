package com.blg.edu.service;

import com.blg.edu.entity.vo.SemesterInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface SemesterService {

    List<SemesterInfoVo> getSemesterList(String universityId);
}
