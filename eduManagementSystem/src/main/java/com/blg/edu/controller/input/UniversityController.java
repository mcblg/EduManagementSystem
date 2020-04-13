package com.blg.edu.controller.input;

import com.blg.edu.entity.University;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.UniversityInfoVo;
import com.blg.edu.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-08
 */
@Controller
public class UniversityController {

    @Autowired
    UniversityService universityService;

    @GetMapping("/university")
    public String universityInfoPage() {
        return "pages/input/university";
    }

    @GetMapping("/universityInfoList")
    public ResponseEntity<AjaxResponse<List<UniversityInfoVo>>> universityInfoList(HttpServletRequest request) {
        List<UniversityInfoVo> list = universityService.getUniversityInfoList();
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), list));
    }
}
