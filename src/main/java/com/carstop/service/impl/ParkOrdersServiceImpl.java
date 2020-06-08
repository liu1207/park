package com.carstop.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carstop.entity.ParkOrders;
import com.carstop.mapper.ParkOrdersMapper;
import com.carstop.service.ParkOrdersService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ParkOrdersServiceImpl extends ServiceImpl<ParkOrdersMapper, ParkOrders> implements ParkOrdersService {
    @Override
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkOrders parkOrders) {
        Page page = new Page(nowPage, rowNum);
        IPage iPage = baseMapper.selectPage(page, null);
        Map<String, Object> map = new HashMap<>();
        map.put("nowPage", iPage.getSize());
        map.put("rowNum", iPage.getCurrent());
        map.put("list", iPage.getRecords());
        return map;
    }
}
