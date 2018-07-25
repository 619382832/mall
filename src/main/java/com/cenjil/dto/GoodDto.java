package com.cenjil.dto;

import com.cenjil.entity.Comment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@ApiModel(value = "查询商品详情的返回参数")
public class GoodDto implements Serializable {
    @ApiModelProperty(value="商品价格",example="2.0")
    private BigDecimal price;

    @ApiModelProperty(value="优惠价格",example="0.5")
    private BigDecimal discount;

    @ApiModelProperty(value="图片url地址",example="http://pic.hsw.cn/0/13/09/09/13090929_929741.jpg")
    private String picture;

    @ApiModelProperty(value="库存数量",example="25")
    private Integer inventory;

    @ApiModelProperty(value="商品描述",example="中国是冰棍的故乡，早在3000多年以前，中国就有用冰解暑的记载。后来皇宫有用奶和糖制成的冰棍。到了元世祖忽必烈时代（大约700多年前），皇宫里又有了类似现在冰激凌的食品，叫做冰酪.")
    private String describe;

    @ApiModelProperty(value="上架时间")
    private Date createTime;

    @ApiModelProperty(value = "用户评论列表")
    private List<Comment> comments;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
