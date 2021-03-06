package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.ClazzInfoVo;
import com.blg.edu.mapper.ClazzMapper;
import com.blg.edu.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    ClazzMapper clazzMapper;

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.ClazzInfoVo>
     * @Description: 〈班级列表〉
     */
    @Override
    public List<ClazzInfoVo> getClazzList(String universityId) {
        return clazzMapper.getClazzList(universityId);
    }
}
