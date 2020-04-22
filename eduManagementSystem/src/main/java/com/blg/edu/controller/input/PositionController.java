package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.PositionInfoVo;
import com.blg.edu.service.PositionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 岗位管理
 * @author: chenjiahao
 * @create: 2020-04-12
 */
@Controller
public class PositionController {

    @Autowired
    PositionService positionService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈岗位管理页面〉
     */
    @RequiresPermissions("positionInfo")
    @GetMapping("/position")
    public String position() {
        return "/pages/input/position";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.PositionInfoVo>>>
     * @Description: 〈岗位列表〉
     */
    @GetMapping("/positionInfoList")
    public ResponseEntity<AjaxResponse<List<PositionInfoVo>>> getPositionList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<PositionInfoVo> positionList = positionService.getPositionList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), positionList));
    }
}
