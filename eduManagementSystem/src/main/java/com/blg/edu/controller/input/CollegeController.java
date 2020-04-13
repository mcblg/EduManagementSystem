package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.CollegeInfoVo;
import com.blg.edu.service.CollegeService;
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
public class CollegeController {

    @Autowired
    CollegeService collegeService;

    @GetMapping("/college")
    public String college() {
        return "/pages/input/college";
    }

    @GetMapping("/collegeInfoList")
    public ResponseEntity<AjaxResponse<List<CollegeInfoVo>>> getCollegeInfoList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<CollegeInfoVo> collegeInfo = collegeService.getCollegeInfo(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), collegeInfo));
    }
}
