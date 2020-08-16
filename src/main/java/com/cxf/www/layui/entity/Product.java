package com.cxf.www.layui.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/4
 */
@Data
public class Product {
    private Integer id;
    private String name;
    private String subtitle;
    private float originalprice;
    private float promoteprice;
    private Integer stock;
    private Integer categoryid;
    private String createdate;
}
