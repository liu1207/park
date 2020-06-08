package com.carstop.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carstop.entity.ParkCarRecords;
import com.carstop.mapper.CarRecordsMapper;
import com.carstop.service.CarRecordsService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarRecordsServiceImpl extends ServiceImpl<CarRecordsMapper, ParkCarRecords> implements CarRecordsService {

    @Override
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkCarRecords search) {
        Map<String, Object> map = new HashMap<>();
        Page page = new Page(nowPage,rowNum);
        IPage iPage = baseMapper.selectPage(page, null);
        map.put("nowPage",iPage.getSize());
        map.put("rowNum",iPage.getCurrent());
        map.put("list",iPage.getRecords());
        return map;
    }
}
