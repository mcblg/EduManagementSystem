package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.ClazzInfoVo;
import com.blg.edu.service.ClazzService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 班级管理
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Controller
public class ClazzController {

    @Autowired
    ClazzService clazzService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈班级页面〉
     */
    @RequiresPermissions("classInfo")
    @GetMapping("/clazz")
    public String clazz() {
        return "/pages/input/clazz";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.ClazzInfoVo>>>
     * @Description: 〈班级列表〉
     */
    @GetMapping("/clazzInfoList")
    public ResponseEntity<AjaxResponse<List<ClazzInfoVo>>> getClazzInfo(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<ClazzInfoVo> clazzList = clazzService.getClazzList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), clazzList));
    }
}
