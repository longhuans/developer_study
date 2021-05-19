package com.ck.service.impl;

import com.ck.dao.IGoodsDao;
import com.ck.entity.Goods;
import com.ck.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-14-10:00
 */
@Service("GoodsService")
public class GoodsServiceimpl implements GoodsService {

@Autowired
    private IGoodsDao goodsDao;

    @Override
    public List<Goods> queryAll() {
        List<Goods> daos = goodsDao.queryAllgoods();
        return daos;
    }
}
