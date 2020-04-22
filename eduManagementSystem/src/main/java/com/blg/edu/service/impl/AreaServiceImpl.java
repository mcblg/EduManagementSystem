package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.AreaInfoVo;
import com.blg.edu.mapper.AreaMapper;
import com.blg.edu.service.AreaService;
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
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaMapper areaMapper;

    /**
     * @Author: cjh on 2020/4/22
     * @params: [UniversityId]
     * @return: java.util.List<com.blg.edu.entity.vo.AreaInfoVo>
     * @Description: 〈功能区列表〉
     */
    @Override
    public List<AreaInfoVo> getAreaInfoList(String UniversityId) {
        return areaMapper.getAreaInfoList(UniversityId);
    }
}
