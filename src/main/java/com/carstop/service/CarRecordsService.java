package com.carstop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carstop.entity.ParkCarRecords;

import java.util.Map;

public interface CarRecordsService extends IService<ParkCarRecords> {

    Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkCarRecords search);
}
