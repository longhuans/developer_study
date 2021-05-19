package com.ck.dao;

import com.ck.entity.Good5;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-18-15:40
 */
public interface GoodDao {

    @Select("select * from t_goods2")
    @ResultMap("GoodMapper")
    public List<Good5> queryAll();

}
