package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.FieldTypeInfoVo;
import com.blg.edu.mapper.FieldTypeMapper;
import com.blg.edu.service.FieldTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class FieldTypeServiceImpl implements FieldTypeService {

    @Autowired
    FieldTypeMapper fieldTypeMapper;

    @Override
    public List<FieldTypeInfoVo> getFieldTypeList(String universityId) {
        return fieldTypeMapper.getFieldTypeList(universityId);
    }
}
