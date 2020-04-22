package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.FieldInfoVo;
import com.blg.edu.mapper.FieldMapper;
import com.blg.edu.service.FieldService;
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
public class FieldServiceImpl implements FieldService {

    @Autowired
    FieldMapper fieldMapper;

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.FieldInfoVo>
     * @Description: 〈场地列表〉
     */
    @Override
    public List<FieldInfoVo> getFieldInfoList(String universityId) {
        return fieldMapper.getFieldInfoList(universityId);
    }
}
