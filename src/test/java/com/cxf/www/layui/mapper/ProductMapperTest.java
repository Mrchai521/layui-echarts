package com.cxf.www.layui.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/4
 */
@SpringBootTest
class ProductMapperTest {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryMapper productCategoryMapper;

    @Test
    public void test() {
        productMapper.selectList(null).forEach(System.out::print);
    }

    @Test
    public void test1() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id", 60);
        System.out.println(productCategoryMapper.selectOne(queryWrapper));
    }
}