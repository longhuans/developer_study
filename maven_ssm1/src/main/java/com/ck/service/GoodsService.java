package com.ck.service;

import com.ck.entity.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-14-9:59
 */
@Service
public interface GoodsService {
    public List<Goods> queryAll();
}
