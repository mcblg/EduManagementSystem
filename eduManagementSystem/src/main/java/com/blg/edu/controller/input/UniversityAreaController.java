package com.blg.edu.controller.input;

import com.blg.edu.common.util.SessionAttributeUtil;
import com.blg.edu.entity.User;
import com.blg.edu.entity.dto.AjaxResponse;
import com.blg.edu.entity.vo.AreaInfoVo;
import com.blg.edu.service.AreaService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description: 学校功能区管理
 * @author: chenjiahao
 * @create: 2020-04-09
 */
@Controller
public class UniversityAreaController {

    @Autowired
    AreaService areaService;

    /**
     * @Author: cjh on 2020/4/22
     * @params: []
     * @return: java.lang.String
     * @Description: 〈学校功能区管理页面〉
     */
    @RequiresPermissions("areaInfo")
    @GetMapping("/universityArea")
    public String universityArea() {
        return "/pages/input/universityArea";
    }

    /**
     * @Author: cjh on 2020/4/22
     * @params: [request]
     * @return: org.springframework.http.ResponseEntity<com.blg.edu.entity.dto.AjaxResponse<java.util.List<com.blg.edu.entity.vo.AreaInfoVo>>>
     * @Description: 〈学校功能区列表〉
     */
    @GetMapping("/universityAreaInfoList")
    public ResponseEntity<AjaxResponse<List<AreaInfoVo>>> getUniversityInfoList(HttpServletRequest request) {
        User user = (User) SessionAttributeUtil.getSessionAttribute("user");
        List<AreaInfoVo> areaInfoList = areaService.getAreaInfoList(user.getUniversityId());
        return ResponseEntity.ok(AjaxResponse.success(request.getRequestURI(), areaInfoList));
    }
}
