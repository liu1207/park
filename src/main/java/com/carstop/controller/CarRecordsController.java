package com.carstop.controller;

import com.carstop.entity.ParkCarRecords;
import com.carstop.service.CarRecordsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Api(tags = {"carRecords接口"})
@RequestMapping("/carRecords")
public class CarRecordsController {

    @Autowired
    private CarRecordsService carRecordsService;

    @ApiOperation(value = "分页", httpMethod = "GET")
    @RequestMapping("/page")
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, @RequestBody ParkCarRecords search) {
        return carRecordsService.findPage(nowPage, rowNum, search);
    }

    @ApiOperation(value = "编辑", httpMethod = "GET")
    @RequestMapping("/edit")
    public String editData(@RequestBody ParkCarRecords search) {
        carRecordsService.saveOrUpdate(search);
        return "succeed";
    }

    @ApiOperation(value = "详情", httpMethod = "GET")
    @RequestMapping("/detail")
    public ParkCarRecords detail(String id) {
        return carRecordsService.getById(id);
    }

    @ApiOperation(value = "删除", httpMethod = "GET")
    @RequestMapping("/del")
    public String del(String id) {
        carRecordsService.removeById(id);
        return "succeed";
    }
}
