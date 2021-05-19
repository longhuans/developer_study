package com.ck.service.impl;

import com.ck.dao.GoodDao;
import com.ck.entity.Good5;
import com.ck.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-18-15:47
 */
@Service
public class GoodServiceimpl implements GoodService {
  @Autowired
  private GoodDao goodDao;

    @Override
    public List<Good5> queryAll() {
        return goodDao.queryAll();
    }
}
