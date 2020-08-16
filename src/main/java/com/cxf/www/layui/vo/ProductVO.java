package com.cxf.www.layui.vo;

import lombok.Data;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/5
 */
@Data
public class ProductVO {
    private Integer id;
    private String name;
    private String subtitle;
    private float originalprice;
    private float promoteprice;
    private Integer stock;
    private String categoryname;
    private String createdate;
}
