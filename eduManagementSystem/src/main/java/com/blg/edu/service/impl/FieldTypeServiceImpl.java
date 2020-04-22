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

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.FieldTypeInfoVo>
     * @Description: 〈场地类型列表〉
     */
    @Override
    public List<FieldTypeInfoVo> getFieldTypeList(String universityId) {
        return fieldTypeMapper.getFieldTypeList(universityId);
    }
}
