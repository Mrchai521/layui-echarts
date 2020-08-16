package com.cxf.www.layui.service;

import com.cxf.www.layui.vo.BarVO;
import com.cxf.www.layui.vo.DataVO;
import com.cxf.www.layui.vo.PieVO;
import com.cxf.www.layui.vo.ProductVO;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/4
 */
public interface ProductService {
    /**
     * 查询所有数据
     *
     * @return
     */
    DataVO<ProductVO> findData(Integer page, Integer limit);

    /**
     * VO之间的 转换
     *
     * @return
     */
    BarVO toVO();

    /**
     * 获取扇形图的VO对象
     *
     * @return
     */
    List<PieVO> getPieVO();
}
