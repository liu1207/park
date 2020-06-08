package com.carstop.controller;

import com.carstop.entity.ParkOnlineLog;
import com.carstop.service.ParkOnlineLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Api(tags = {"parkOnlineLog接口"})
@RequestMapping("/parkOnlineLog")
public class ParkOnlineLogController {

    @Autowired
    private ParkOnlineLogService parkOnlineLogService;

    @ApiOperation(value = "分页", httpMethod = "GET")
    @RequestMapping("/page")
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkOnlineLog search) {
        return parkOnlineLogService.findPage(nowPage, rowNum, search);
    }

    @ApiOperation(value = "编辑",httpMethod = "GET")
    @RequestMapping("/edit")
    public String editData(@RequestBody ParkOnlineLog search){
        parkOnlineLogService.saveOrUpdate(search);
        return "succeed";
    }

    @ApiOperation(value = "详情", httpMethod = "GET")
    @RequestMapping("/detail")
    public ParkOnlineLog detail(String id) {
        return parkOnlineLogService.getById(id);
    }

    @ApiOperation(value = "删除",httpMethod = "GET")
    @RequestMapping("/del")
    public String del(String id){
        parkOnlineLogService.removeById(id);
        return "succeed";
    }
}
