package com.carstop.controller;

import com.carstop.entity.ParkOrders;
import com.carstop.service.ParkOrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Api(tags = {"parkOrders接口"})
@RequestMapping("/parkOrders")
public class ParkOrdersController {

    @Autowired
    private ParkOrdersService parkOrdersService;

    @ApiOperation(value = "分页",httpMethod = "GET")
    @RequestMapping("/page")
    public Map<String,Object> findPage(Integer nowPage, Integer rowNum, ParkOrders parkOrders){
        return parkOrdersService.findPage(nowPage,rowNum,parkOrders);
    }

    @ApiOperation(value = "编辑",httpMethod = "GET")
    @RequestMapping("/edit")
    public String editData(@RequestBody ParkOrders search){
        parkOrdersService.saveOrUpdate(search);
        return "succeed";
    }

    @ApiOperation(value = "详情",httpMethod = "GET")
    @RequestMapping("/detail")
    public ParkOrders detail(String id){
        return parkOrdersService.getById(id);
    }

    @ApiOperation(value = "删除",httpMethod = "GET")
    @RequestMapping("/del")
    public String del(String id){
        parkOrdersService.removeById(id);
        return "succeed";
    }
}
