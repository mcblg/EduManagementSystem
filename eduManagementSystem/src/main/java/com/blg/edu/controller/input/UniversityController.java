package com.blg.edu.controller.input;

import com.blg.edu.entity.University;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.UniversityInfoVo;
import com.blg.edu.service.UniversityService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 学校管理
 * @author: chenjiahao
 * @create: 2020-04-08
 */
@Controller
public class UniversityController {

    @Autowired
    UniversityService universityService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈学校管理页面〉
     */
    @RequiresPermissions("universityInfo")
    @GetMapping("/university")
    public String universityInfoPage() {
        return "pages/input/university";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.UniversityInfoVo>>>
     * @Description: 〈学习列表〉
     */
    @GetMapping("/universityInfoList")
    public ResponseEntity<AjaxResponse<List<UniversityInfoVo>>> universityInfoList(HttpServletRequest request) {
        List<UniversityInfoVo> list = universityService.getUniversityInfoList();
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), list));
    }
}
