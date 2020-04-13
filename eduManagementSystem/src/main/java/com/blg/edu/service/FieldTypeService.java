package com.blg.edu.service;

import com.blg.edu.entity.vo.FieldTypeInfoVo;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
public interface FieldTypeService {

    List<FieldTypeInfoVo> getFieldTypeList(String universityId);
}
