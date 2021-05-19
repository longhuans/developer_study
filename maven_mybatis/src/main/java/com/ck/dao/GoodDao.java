package com.ck.dao;

import com.ck.entity.Good;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-13-10:11
 */
public interface GoodDao {
    //查询所有商品
    @Select("select * from t_goods2")
    @ResultMap("GoodMappers")
    public List<Good> queryAllgoods();
}
