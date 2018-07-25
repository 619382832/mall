package com.cenjil.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value = "上架商品和修改商品信息的传入参数")
public class GoodParam  implements Serializable {

    @ApiModelProperty(value="商品id(上架时可以为空)",example="1")
    private Integer id;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
}
