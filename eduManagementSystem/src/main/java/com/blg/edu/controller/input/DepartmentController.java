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
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-10
 */
@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequiresPermissions("departmentInfo")
    @GetMapping("/department")
    public String department() {
        return "/pages/input/department";
    }

    @GetMapping("/departmentInfoList")
    public ResponseEntity<AjaxResponse<List<DepartmentInfoVo>>> getDepartmentInfoList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<DepartmentInfoVo> departmentList = departmentService.getDepartmentList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), departmentList));
    }
}
