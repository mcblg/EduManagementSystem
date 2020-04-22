package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.FieldInfoVo;
import com.blg.edu.service.FieldService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 场地管理
 * @author: chenjiahao
 * @create: 2020-04-09
 */
@Controller
public class FieldController {

    @Autowired
    FieldService fieldService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈场地管理页面〉
     */
    @RequiresPermissions("fieldInfo")
    @GetMapping("/field")
    public String field() {
        return "/pages/input/field";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.FieldInfoVo>>>
     * @Description: 〈场地列表〉
     */
    @GetMapping("/fieldInfoList")
    public ResponseEntity<AjaxResponse<List<FieldInfoVo>>> getFieldInfoList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<FieldInfoVo> fieldInfoList = fieldService.getFieldInfoList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), fieldInfoList));
    }
}
