package com.blg.edu.service;

import com.blg.edu.entity.vo.DepartmentInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-10
 */
public interface DepartmentService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.DepartmentInfoVo>
     * @Description: 〈部门列表〉
     */
    List<DepartmentInfoVo> getDepartmentList(String universityId);
}
