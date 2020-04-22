package com.blg.edu.service;

import com.blg.edu.entity.vo.FieldTypeInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
public interface FieldTypeService {

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.FieldTypeInfoVo>
     * @Description: 〈场地类型列表〉
     */
    List<FieldTypeInfoVo> getFieldTypeList(String universityId);
}
