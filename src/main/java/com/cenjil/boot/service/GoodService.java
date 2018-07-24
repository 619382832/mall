package com.cenjil.boot.service;

import com.cenjil.boot.mapper.GoodsMapper;
import com.cenjil.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodService {

    @Autowired
    private GoodsMapper mapper;

    /**
     *通过id查看一个商品
     * @param id 传入参数id
     * @return 一个Goods实体
     */
    public Goods findById(Integer id) {
        return mapper.selectById(id);
        }

}
