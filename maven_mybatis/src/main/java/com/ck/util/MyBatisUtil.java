package com.ck.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;


public class MyBatisUtil {
    private static SqlSessionFactory factory;
    // 在静态块读取配置文件
    static{
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            factory =new SqlSessionFactoryBuilder().build(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 定义方法获取数据库操作SqlSession对象
    public static SqlSession openSession(boolean transtction){
        return factory.openSession(transtction);
    }


}
