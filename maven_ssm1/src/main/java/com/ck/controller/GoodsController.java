package com.ck.controller;

import com.ck.entity.Goods;
import com.ck.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-14-10:02
 */
@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    //@RequestMapping(value="queryAllGoods2",method="get") 等价于下一个getMapping注解
    @GetMapping("queryAllGoods2")
    public  String queryAllgoods(ModelMap map){
        List<Goods> s = goodsService.queryAll();
        map.put("list", s);
        return "query";



    }

}
