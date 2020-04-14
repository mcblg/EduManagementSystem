package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.FieldInfoVo;
import com.blg.edu.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-09
 */
@Controller
public class FieldController {

    @Autowired
    FieldService fieldService;

    @GetMapping("/field")
    public String field() {
        return "/pages/input/field";
    }

    @GetMapping("/fieldInfoList")
    public ResponseEntity<AjaxResponse<List<FieldInfoVo>>> getFieldInfoList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<FieldInfoVo> fieldInfoList = fieldService.getFieldInfoList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), fieldInfoList));
    }
}