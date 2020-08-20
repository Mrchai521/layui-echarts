package com.cxf.www.layui.controller;

import com.cxf.www.layui.entity.Map;
import com.cxf.www.layui.service.IMapService;
import com.cxf.www.layui.service.ProductService;
import com.cxf.www.layui.vo.BarVO;
import com.cxf.www.layui.vo.DataVO;
import com.cxf.www.layui.vo.PieVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author:柴新峰
 * @create:2020/6/5
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private IMapService iMapService;

    @RequestMapping("/list")
    @ResponseBody
    public DataVO list(Integer page, Integer limit) {
        return productService.findData(page, limit);
    }

    /**
     * 后台映射
     *
     * @param url
     * @return
     */
    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url) {
        return url;
    }

    @RequestMapping("/echartsList")
    @ResponseBody
    public BarVO list() {
        return productService.toVO();
    }

    @RequestMapping("/echartsPieList")
    @ResponseBody
    public List<PieVO> list1() {
        return productService.getPieVO();
    }

    @RequestMapping(value = "/maps",method = RequestMethod.GET)
    @ResponseBody
    public List<Map> mapsList() {
        return iMapService.findMapList();
    }
}
