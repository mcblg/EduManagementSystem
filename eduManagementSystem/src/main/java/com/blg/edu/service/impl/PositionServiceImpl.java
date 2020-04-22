package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.PositionInfoVo;
import com.blg.edu.mapper.PositionMapper;
import com.blg.edu.service.PositionService;
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
public class PositionServiceImpl implements PositionService {

    @Autowired
    PositionMapper positionMapper;

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.PositionInfoVo>
     * @Description: 〈岗位列表〉
     */
    @Override
    public List<PositionInfoVo> getPositionList(String universityId) {
        return positionMapper.getPositionList(universityId);
    }
}
