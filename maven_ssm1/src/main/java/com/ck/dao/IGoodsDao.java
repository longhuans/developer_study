package com.ck.dao;

import com.ck.entity.Goods;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-14-9:56
 */
public interface IGoodsDao {
    //查询所有商品
    @Select("select * from t_goods2")
    @ResultMap("GoodMappers")
    public List<Goods> queryAllgoods();
}
