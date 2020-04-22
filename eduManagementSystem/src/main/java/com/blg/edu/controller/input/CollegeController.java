package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.CollegeInfoVo;
import com.blg.edu.service.CollegeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 学院管理
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Controller
public class CollegeController {

    @Autowired
    CollegeService collegeService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈学院管理页面〉
     */
    @RequiresPermissions("collegeInfo")
    @GetMapping("/college")
    public String college() {
        return "/pages/input/college";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.CollegeInfoVo>>>
     * @Description: 〈学院列表〉
     */
    @GetMapping("/collegeInfoList")
    public ResponseEntity<AjaxResponse<List<CollegeInfoVo>>> getCollegeInfoList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<CollegeInfoVo> collegeInfo = collegeService.getCollegeInfo(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), collegeInfo));
    }
}
