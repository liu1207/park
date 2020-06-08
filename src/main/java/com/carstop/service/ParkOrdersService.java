package com.carstop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carstop.entity.ParkOrders;

import java.util.Map;

public interface ParkOrdersService extends IService<ParkOrders> {
    Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkOrders parkOrders);
}
