package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.SemesterInfoVo;
import com.blg.edu.service.SemesterService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 学期管理
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Controller
public class SemesterController {

    @Autowired
    SemesterService semesterService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈校历管理页面〉
     */
    @RequiresPermissions("semesterInfo")
    @GetMapping("/semester")
    public String semester() {
        return "/pages/input/semester";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<com.blg.edu.entity.vo.SemesterInfoVo>>
     * @Description: 〈学期列表〉
     */
    @GetMapping("/semesterInfoList")
    public ResponseEntity<AjaxResponse<SemesterInfoVo>> getSemesterList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<SemesterInfoVo> semesterList = semesterService.getSemesterList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), semesterList));
    }
}
