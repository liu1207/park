package com.carstop.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carstop.entity.ParkCarRecords;
import com.carstop.entity.ParkConfig;
import com.carstop.mapper.ParkConfigMapper;
import com.carstop.service.ParkConfigService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ParkConfigServiceImpl extends ServiceImpl<ParkConfigMapper, ParkConfig> implements ParkConfigService {

    @Override
    public Map<String, Object> findPage(Integer nowPage, Integer rowNum, ParkConfig search) {
        Page page = new Page(nowPage, rowNum);
        IPage iPage = baseMapper.selectPage(page, null);
        Map<String, Object> map = new HashMap<>();
        map.put("nowPage", iPage.getSize());
        map.put("rowNum", iPage.getCurrent());
        map.put("list", iPage.getRecords());
        return map;
    }
}
