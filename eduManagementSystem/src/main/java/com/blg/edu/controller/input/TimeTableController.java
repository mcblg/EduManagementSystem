package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.TimeTableInfoVo;
import com.blg.edu.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@RestController
public class TimeTableController {
    @Autowired
    TimeTableService timeTableService;

    @GetMapping("/timeTableInfoList")
    public ResponseEntity<AjaxResponse<List<TimeTableInfoVo>>> getTimeTableList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<TimeTableInfoVo> timeTableList = timeTableService.getTimeTableList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), timeTableList));
    }
}
