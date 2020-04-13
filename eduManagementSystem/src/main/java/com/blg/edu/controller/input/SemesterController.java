package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.SemesterInfoVo;
import com.blg.edu.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Controller
public class SemesterController {

    @Autowired
    SemesterService semesterService;

    @GetMapping("/semester")
    public String semester() {
        return "/pages/input/semester";
    }

    @GetMapping("/semesterInfoList")
    public ResponseEntity<AjaxResponse<SemesterInfoVo>> getSemesterList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<SemesterInfoVo> semesterList = semesterService.getSemesterList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), semesterList));
    }
}
