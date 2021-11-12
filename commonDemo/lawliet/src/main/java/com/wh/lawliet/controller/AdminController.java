package com.wh.lawliet.controller;

import com.wh.lawliet.apo.SysLogs;
import com.wh.lawliet.entity.Admin;
import com.wh.lawliet.utils.AjaxResult;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * 什么？我是真滴帅
 *
 * @author WuHao on 10:02 2021/11/11
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    @RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
    @ApiOperation(value = "添加管理员")
    @SysLogs("添加管理员")
    public AjaxResult addAdmin(@RequestBody Admin admin){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setData("你好");
        return ajaxResult;
    }

}
