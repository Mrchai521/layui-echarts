package com.cxf.www.layui.service.impl;

import com.cxf.www.layui.entity.Map;
import com.cxf.www.layui.mapper.MapsMapper;
import com.cxf.www.layui.service.IMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/8/20
 */
@Service
public class MapServiceImpl implements IMapService {
    @Autowired
    private MapsMapper mapsMapper;

    @Override
    public List<Map> findMapList() {
        return mapsMapper.selectList(null);
    }
}
