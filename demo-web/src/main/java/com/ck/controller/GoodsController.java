package com.ck.controller;


import com.ck.entity.Good5;
import com.ck.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    private GoodService goodService;

//    //创建log4j
//    Logger logger = Logger.getLogger(GoodsController.class);
//
//    @RequestMapping("queryAllGoods2")
//    public  String queryAllgoods(ModelMap map){
//        logger.info("这是一条info级别的日志");
//        logger.warn("这是一条warn级别的日志");
//        try {
//            List<Good> s = goodService.queryAll();
//            map.put("list", s);
//            return "query";
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//        return  null;
//
//    }

    @RequestMapping("queryAllGood")
    @ResponseBody
    public List<Good5> queryAll(){
        System.out.println(1);
        System.out.println("喂喂喂");
        return goodService.queryAll();
    }



}
