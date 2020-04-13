package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.PositionInfoVo;
import com.blg.edu.service.PositionService;
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
public class PositionController {

    @Autowired
    PositionService positionService;


    @GetMapping("/position")
    public String position() {
        return "/pages/input/position";
    }

    @GetMapping("/positionInfoList")
    public ResponseEntity<AjaxResponse<List<PositionInfoVo>>> getPositionList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<PositionInfoVo> positionList = positionService.getPositionList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), positionList));
    }
}
