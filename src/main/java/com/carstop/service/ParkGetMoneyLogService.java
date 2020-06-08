package com.carstop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carstop.entity.ParkConfig;
import com.carstop.entity.ParkGetMoneyLog;

import java.util.Map;

public interface ParkGetMoneyLogService extends IService<ParkGetMoneyLog> {
    Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkGetMoneyLog search);
}
