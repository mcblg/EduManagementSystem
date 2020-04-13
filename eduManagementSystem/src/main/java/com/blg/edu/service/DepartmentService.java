package com.blg.edu.service;

import com.blg.edu.entity.vo.DepartmentInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-10
 */
public interface DepartmentService {

    List<DepartmentInfoVo> getDepartmentList(String universityId);
}
