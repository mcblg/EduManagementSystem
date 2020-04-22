package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.FieldTypeInfoVo;
import com.blg.edu.service.FieldTypeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 场地类型管理
 * @author: chenjiahao
 * @create: 2020-04-09
 */
@Controller
public class FieldTypeController {

    @Autowired
    FieldTypeService fieldTypeService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈场地类型管理页面〉
     */
    @RequiresPermissions("fieldTypeInfo")
    @GetMapping("/fieldType")
    public String fieldType() {
        return "/pages/input/fieldType";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.FieldTypeInfoVo>>>
     * @Description: 〈场地类型列表〉
     */
    @GetMapping("/fieldTypeInfoList")
    public ResponseEntity<AjaxResponse<List<FieldTypeInfoVo>>> getFieldInfoList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<FieldTypeInfoVo> fieldTypeList = fieldTypeService.getFieldTypeList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), fieldTypeList));
    }
}
