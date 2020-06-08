package com.carstop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carstop.entity.ParkConfig;

import java.util.Map;

public interface ParkConfigService extends IService<ParkConfig> {
    Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkConfig search);
}
