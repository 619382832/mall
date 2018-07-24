package com.cenjil.boot.mapper;

import com.cenjil.entity.Goods;

public interface GoodsMapper  {

    Goods selectById(Integer id);
}