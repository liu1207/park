package com.carstop.controller;

import com.carstop.entity.ParkConfig;
import com.carstop.service.ParkConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Api(tags = {"ParkConfig接口"})
@RequestMapping("/ParkConfig")
public class ParkConfigController {

    @Autowired
    private ParkConfigService parkConfigService;

    @ApiOperation(value = "分页", httpMethod = "GET")
    @RequestMapping("/page")
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkConfig search) {
        return parkConfigService.findPage(nowPage, rowNum, search);
    }

    @ApiOperation(value = "编辑", httpMethod = "GET")
    @RequestMapping("/edit")
    public String editData(@RequestBody ParkConfig search) {
        parkConfigService.saveOrUpdate(search);
        return "succeed";
    }

    @ApiOperation(value = "详情", httpMethod = "GET")
    @RequestMapping("/detail")
    public ParkConfig detail(String id) {
        return parkConfigService.getById(id);
    }

    @ApiOperation(value = "删除", httpMethod = "GET")
    @RequestMapping("/del")
    public String del(String id) {
        parkConfigService.removeById(id);
        return "succeed";
    }
}
