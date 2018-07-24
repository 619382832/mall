package com.cenjil.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "comment")
public class Comment {
    /**
     * 用户评论的id
     */
    @Id
    private Integer id;

    /**
     * 用户评分
     */
    private Integer point;

    /**
     * 点赞数量
     */
    private Integer like;

    /**
     * 评论的时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取用户评论的id
     *
     * @return id - 用户评论的id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户评论的id
     *
     * @param id 用户评论的id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户评分
     *
     * @return point - 用户评分
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * 设置用户评分
     *
     * @param point 用户评分
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * 获取点赞数量
     *
     * @return like - 点赞数量
     */
    public Integer getLike() {
        return like;
    }

    /**
     * 设置点赞数量
     *
     * @param like 点赞数量
     */
    public void setLike(Integer like) {
        this.like = like;
    }

    /**
     * 获取评论的时间
     *
     * @return create_time - 评论的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置评论的时间
     *
     * @param createTime 评论的时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}