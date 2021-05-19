package com.ck.test;

import com.ck.dao.GoodDaoImpl;
import com.ck.entity.Good;
import org.junit.Test;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-13-10:47
 */
public class MyTest1 {
    @Test
    public void  test1(){
        GoodDaoImpl dao = new GoodDaoImpl();
        List<Good> goodList = dao.queryAllgoods();
        System.out.println(goodList);
    }
}
