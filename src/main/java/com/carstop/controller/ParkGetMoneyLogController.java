package com.carstop.controller;

import com.carstop.entity.ParkGetMoneyLog;
import com.carstop.service.ParkGetMoneyLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Api(tags = {"parkGetMoneyLog接口"})
@RequestMapping("/parkGetMoneyLog")
public class ParkGetMoneyLogController {

    @Autowired
    private ParkGetMoneyLogService parkGetMoneyLogService;

    @ApiOperation(value = "分页", httpMethod = "GET")
    @RequestMapping("/page")
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkGetMoneyLog search) {
        return parkGetMoneyLogService.findPage(nowPage, rowNum, search);
    }

    @ApiOperation(value = "编辑", httpMethod = "GET")
    @RequestMapping("/edit")
    public String editData(@RequestBody ParkGetMoneyLog search) {
        parkGetMoneyLogService.saveOrUpdate(search);
        return "succeed";
    }

    @ApiOperation(value = "详情", httpMethod = "GET")
    @RequestMapping("/detail")
    public ParkGetMoneyLog detail(String id) {
        return parkGetMoneyLogService.getById(id);
    }

    @ApiOperation(value = "删除", httpMethod = "GET")
    @RequestMapping("/del")
    public String del(String id) {
        parkGetMoneyLogService.removeById(id);
        return "succeed";
    }
}
