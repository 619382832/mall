package com.cenjil.boot.service;

import com.cenjil.boot.mapper.CommentMapper;
import com.cenjil.boot.mapper.GoodsMapper;
import com.cenjil.dto.GoodDto;
import com.cenjil.entity.Goods;
import com.cenjil.param.GoodParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class GoodService {

    @Autowired
    private GoodsMapper mapper;
    @Autowired
    private CommentMapper commentMapper;

    /**
     * 上架商品
     *
     * @param goodParam 商品基本信息
     * @return 是否上架成功
     */
    public boolean add(GoodParam goodParam) {
        Goods goods = new Goods();
        Assert.isTrue(goodParam.getPrice().compareTo(goodParam.getDiscount()) > -1, "折扣不能超过价格!");//断言条件为真,否则抛出异常信息
        goods.setPrice(goodParam.getPrice());
        goods.setDescribe(goodParam.getDescribe());
        goods.setDiscount(goodParam.getDiscount());
        goods.setPicture(goodParam.getPicture());
        goods.setInventory(goodParam.getInventory());
        goods.setCreateTime(new Date());
        return mapper.add(goods) > 0;
    }

    /**
     * 通过id查看商品详情
     *
     * @param id 传入参数id
     * @return 一个商品详情的新建类
     */
    public GoodDto findById(Integer id) {
        GoodDto goodDto = new GoodDto();
        Goods goods = mapper.selectById(id);
        goodDto.setCreateTime(goods.getCreateTime());
        goodDto.setDescribe(goods.getDescribe());
        goodDto.setInventory(goods.getInventory());
        goodDto.setDiscount(goods.getDiscount());
        goodDto.setPicture(goods.getPicture());
        goodDto.setPrice(goods.getPrice());
        //获取评论的id值字符串 例如:2,3,5
        String comment = goods.getComment();
        if (comment.isEmpty()) {
            return goodDto;
        } else {
            //拆分comment字符串获取字符流,转化为Integer类型,装入List<Integer>
            List<Integer> commentIds = Stream.of(comment.split(",")).map(Integer::valueOf).collect(Collectors.toList());
            //通过id的集合查找对应的List<Comment>,赋值GoodDto
            goodDto.setComments(commentMapper.selectByIds(commentIds));
            return goodDto;
        }
    }

    /**
     * 修改商品信息
     *
     * @param goodParam 修改的传入参数
     * @return 是否修改成功
     */
    public Boolean update(GoodParam goodParam) {
        Goods goods = new Goods();
        goods.setId(goodParam.getId());
        goods.setPrice(goodParam.getPrice());
        goods.setDescribe(goodParam.getDescribe());
        goods.setDiscount(goodParam.getDiscount());
        goods.setPicture(goodParam.getPicture());
        return mapper.update(goods) > 0;
    }



}
