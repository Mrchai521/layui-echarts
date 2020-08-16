package com.cxf.www.layui.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cxf.www.layui.entity.Product;
import com.cxf.www.layui.vo.ProductBarVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/4
 */
public interface ProductMapper extends BaseMapper<Product> {
    @Select("select p.name,SUM(pr.number) count from orderitem pr,product p where pr.productId=p.id GROUP BY productId")
    List<ProductBarVO> findAlllList();
}
