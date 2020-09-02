package com.cxf.www.layui.service.impl;

import com.cxf.www.layui.entity.Relation;
import com.cxf.www.layui.mapper.RelationMapper;
import com.cxf.www.layui.service.IRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/8/31
 */
@Service
public class RelationServiceImpl implements IRelationService {
    @Autowired
    private RelationMapper relationMapper;

    @Override
    public List<Relation> findAll() {
        return relationMapper.selectList(null);
    }
}
