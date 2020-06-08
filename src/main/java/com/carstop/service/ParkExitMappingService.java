package com.carstop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carstop.entity.ParkExitMapping;
import com.carstop.entity.ParkGetMoneyLog;

import java.util.Map;

public interface ParkExitMappingService extends IService<ParkExitMapping> {

    Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkGetMoneyLog search);
}
