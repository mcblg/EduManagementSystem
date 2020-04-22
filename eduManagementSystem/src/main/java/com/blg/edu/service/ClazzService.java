package com.blg.edu.service;

import com.blg.edu.entity.vo.ClazzInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
public interface ClazzService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.ClazzInfoVo>
     * @Description: 〈班级列表〉
     */
    List<ClazzInfoVo> getClazzList(String universityId);
}
