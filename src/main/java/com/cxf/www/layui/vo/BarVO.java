package com.cxf.www.layui.vo;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/11
 */

import lombok.Data;

import java.util.List;

@Data
public class BarVO {
    private List<String> names;
    private List<Integer> values;
}
