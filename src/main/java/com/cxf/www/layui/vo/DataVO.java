package com.cxf.www.layui.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.Setter;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/4
 */
@Data
@EqualsAndHashCode
public class DataVO<T> {
    private Integer code;
    private String message;
    private Integer count;
    private List<T> data;
}
