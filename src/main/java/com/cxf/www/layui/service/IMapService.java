package com.cxf.www.layui.service;

import com.cxf.www.layui.entity.Map;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/8/20
 */
public interface IMapService {
    /**
     * 查询所有的地图数据
     */
    List<Map> findMapList();
}
