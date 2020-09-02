package com.cxf.www.layui.service;

import com.cxf.www.layui.entity.Relation;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/8/31
 */
public interface IRelationService {
    /**
     * 查询所有
     * @return
     */
    List<Relation> findAll();
}
