package com.carstop.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carstop.entity.ParkOnlineLog;
import com.carstop.mapper.ParkOnlineLogMapper;
import com.carstop.service.ParkOnlineLogService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ParkOnlineLogServiceImpl extends ServiceImpl<ParkOnlineLogMapper, ParkOnlineLog> implements ParkOnlineLogService {
    @Override
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkOnlineLog search) {
        Page page = new Page(nowPage, rowNum);
        IPage iPage = baseMapper.selectPage(page, null);
        Map<String, Object> map = new HashMap<>();
        map.put("nowPage", iPage.getSize());
        map.put("rowNum", iPage.getCurrent());
        map.put("list", iPage.getRecords());
        return map;
    }
}
