package com.carstop.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carstop.entity.ParkConfig;
import com.carstop.entity.ParkGetMoneyLog;
import com.carstop.mapper.ParkGetMoneyLogMapper;
import com.carstop.service.ParkGetMoneyLogService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ParkGetMoneyLogServiceImpl extends ServiceImpl<ParkGetMoneyLogMapper, ParkGetMoneyLog> implements ParkGetMoneyLogService {
    @Override
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkGetMoneyLog search) {
        Page page = new Page(nowPage,rowNum);
        IPage<ParkGetMoneyLog> iPage = baseMapper.selectPage(page,null);
        Map<String,Object> map = new HashMap<>();
        map.put("nowPage", iPage.getSize());
        map.put("rowNum", iPage.getCurrent());
        map.put("list", iPage.getRecords());
        return map;
    }
}
