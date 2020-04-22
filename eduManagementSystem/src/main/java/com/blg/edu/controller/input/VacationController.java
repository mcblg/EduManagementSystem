package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.VacationInfoVo;
import com.blg.edu.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 假期管理
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@RestController
public class VacationController {

    @Autowired
    VacationService vacationService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.VacationInfoVo>>>
     * @Description: 〈假期管理页面〉
     */
    @GetMapping("/vacationInfoList")
    public ResponseEntity<AjaxResponse<List<VacationInfoVo>>> getVacationList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<VacationInfoVo> vacationList = vacationService.getVacationList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), vacationList));
    }
}
