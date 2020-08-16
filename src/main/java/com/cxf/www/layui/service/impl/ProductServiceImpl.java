package com.cxf.www.layui.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cxf.www.layui.entity.Category;
import com.cxf.www.layui.entity.Product;
import com.cxf.www.layui.mapper.CategoryMapper;
import com.cxf.www.layui.mapper.ProductMapper;
import com.cxf.www.layui.service.ProductService;
import com.cxf.www.layui.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/5
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public DataVO<ProductVO> findData(Integer page, Integer limit) {
        DataVO dataVO = new DataVO();
        dataVO.setCode(0);
        dataVO.setMessage("");
//        dataVO.setCount(productMapper.selectCount(null));
        // 数据分页
        IPage<Product> iPage = new Page<>(page, limit);
        IPage<Product> result = productMapper.selectPage(iPage, null);
        dataVO.setCount(Integer.parseInt(String.valueOf(result.getTotal())));
        List<Product> list = result.getRecords();
        // 转换为VO类型
        List<ProductVO> productVOList = new ArrayList<>();
        for (Product product : list) {
            ProductVO productVO = new ProductVO();
            // 将普通类型转换成vo类型
            BeanUtils.copyProperties(product, productVO);
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("id", product.getCategoryid());
            productVO.setCategoryname(categoryMapper.selectOne(queryWrapper).getName());
            productVOList.add(productVO);
        }
        dataVO.setData(productVOList);
        return dataVO;
    }

    @Override
    public BarVO toVO() {
        List<ProductBarVO> list = productMapper.findAlllList();
        List<String> listNames = new ArrayList<>();
        List<Integer> listCount = new ArrayList<>();
        BarVO barVO = new BarVO();
        for (ProductBarVO pro : list) {
            listNames.add(pro.getName());
            listCount.add(pro.getCount());
        }
        barVO.setNames(listNames);
        barVO.setValues(listCount);
        return barVO;
    }

    @Override
    public List<PieVO> getPieVO() {
        List<ProductBarVO> list = productMapper.findAlllList();
        List<PieVO> pieVOList = list.stream().map(e -> new PieVO(e.getName(), e.getCount())).collect(Collectors.toList());

        return pieVOList;
    }
}
