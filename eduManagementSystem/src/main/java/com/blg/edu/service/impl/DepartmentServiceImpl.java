package com.blg.edu.service.impl;

import com.blg.edu.entity.vo.DepartmentInfoVo;
import com.blg.edu.mapper.DepartmentMapper;
import com.blg.edu.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * @Author: cjh on 2020/4/22
     * @params: [universityId]
     * @return: java.util.List<com.blg.edu.entity.vo.DepartmentInfoVo>
     * @Description: 〈部门列表〉
     */
    @Override
    public List<DepartmentInfoVo> getDepartmentList(String universityId) {
        return departmentMapper.getDepartmentList(universityId);
    }
}
