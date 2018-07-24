package com.cenjil.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "goods")
public class Goods implements Serializable {
    /**
     * 商品id
     */
    @Id
    private Integer id;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 优惠价格(减免的部分)
     */
    private BigDecimal discount;

    /**
     * 图片的url地址
     */
    private String picture;

    /**
     * 库存的数量
     */
    private Integer inventory;

    /**
     * 上架的时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 用户评论(用逗号分隔的字符串) 例:1,2,3
     */
    private String comment;

    /**
     * 删除时间
     */
    @Column(name = "delete_time")
    private Date deleteTime;

    /**
     * 商品描述
     */
    private String describe;

    /**
     * 获取商品id
     *
     * @return id - 商品id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置商品id
     *
     * @param id 商品id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取优惠价格(减免的部分)
     *
     * @return discount - 优惠价格(减免的部分)
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * 设置优惠价格(减免的部分)
     *
     * @param discount 优惠价格(减免的部分)
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * 获取图片的url地址
     *
     * @return picture - 图片的url地址
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置图片的url地址
     *
     * @param picture 图片的url地址
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取库存的数量
     *
     * @return inventory - 库存的数量
     */
    public Integer getInventory() {
        return inventory;
    }

    /**
     * 设置库存的数量
     *
     * @param inventory 库存的数量
     */
    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    /**
     * 获取上架的时间
     *
     * @return create_time - 上架的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置上架的时间
     *
     * @param createTime 上架的时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取用户评论(用逗号分隔的字符串) 例:1,2,3
     *
     * @return comment - 用户评论(用逗号分隔的字符串) 例:1,2,3
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置用户评论(用逗号分隔的字符串) 例:1,2,3
     *
     * @param comment 用户评论(用逗号分隔的字符串) 例:1,2,3
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取删除时间
     *
     * @return delete_time - 删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 设置删除时间
     *
     * @param deleteTime 删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取商品描述
     *
     * @return describe - 商品描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置商品描述
     *
     * @param describe 商品描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }
}