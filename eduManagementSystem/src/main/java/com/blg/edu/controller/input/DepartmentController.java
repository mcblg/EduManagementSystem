package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.DepartmentInfoVo;
import com.blg.edu.service.DepartmentService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 部门管理
 * @author: chenjiahao
 * @create: 2020-04-10
 */
@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈部门管理页面〉
     */
    @RequiresPermissions("departmentInfo")
    @GetMapping("/department")
    public String department() {
        return "/pages/input/department";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.DepartmentInfoVo>>>
     * @Description: 〈部门列表〉
     */
    @GetMapping("/departmentInfoList")
    public ResponseEntity<AjaxResponse<List<DepartmentInfoVo>>> getDepartmentInfoList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<DepartmentInfoVo> departmentList = departmentService.getDepartmentList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), departmentList));
    }
}
