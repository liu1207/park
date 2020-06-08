package com.carstop.controller;

import com.carstop.entity.ParkExitMapping;
import com.carstop.entity.ParkGetMoneyLog;
import com.carstop.service.ParkExitMappingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Api(tags = {"parkExitMapping接口"})
@RequestMapping("/parkExitMapping")
public class ParkExitMappingController {

    @Autowired
    private ParkExitMappingService parkExitMappingService;

    @ApiOperation(value = "分页", httpMethod = "GET")
    @RequestMapping("/page")
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkGetMoneyLog search) {
        return parkExitMappingService.findPage(nowPage, rowNum, search);
    }

    @ApiOperation(value = "编辑", httpMethod = "GET")
    @RequestMapping("/edit")
    public String editData(@RequestBody ParkExitMapping search) {
        parkExitMappingService.saveOrUpdate(search);
        return "succeed";
    }

    @ApiOperation(value = "详情", httpMethod = "GET")
    @RequestMapping("/detail")
    public ParkExitMapping detail(String id) {
        return parkExitMappingService.getById(id);
    }

    @ApiOperation(value = "删除", httpMethod = "GET")
    @RequestMapping("/del")
    public String del(String id) {
        parkExitMappingService.removeById(id);
        return "succeed";
    }
}
