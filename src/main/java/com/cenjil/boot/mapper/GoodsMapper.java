package com.cenjil.boot.mapper;

import com.cenjil.entity.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface GoodsMapper {

    /**
     * 添加一个商品
     */
    Integer add(@Param("good") Goods goods);

    /**
     * 查找一个商品
     */
    Goods selectById(Integer id);

    /**
     * 修改商品信息
     */
    Integer update(@Param("good") Goods good);

}