package com.blg.edu.service;

import com.blg.edu.entity.vo.SemesterInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface SemesterService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.SemesterInfoVo>
     * @Description: 〈学期列表〉
     */
    List<SemesterInfoVo> getSemesterList(String universityId);
}
