package com.ck.dao;

import com.ck.entity.Good;
import com.ck.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-13-10:17
 */
public class GoodDaoImpl {
    public List<Good> queryAllgoods(){
        SqlSession session = MyBatisUtil.openSession(false);
        GoodDao mapper = session.getMapper(GoodDao.class);
        List<Good> goodList = mapper.queryAllgoods();
        return goodList;
    }
}
