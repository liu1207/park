package com.carstop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carstop.entity.ParkOnlineLog;

import java.util.Map;

public interface ParkOnlineLogService extends IService<ParkOnlineLog> {
    Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkOnlineLog search);
}
