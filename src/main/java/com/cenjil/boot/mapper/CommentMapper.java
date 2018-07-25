package com.cenjil.boot.mapper;

import com.cenjil.entity.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {
    /**
     *点赞数量+1
     */
    Integer like(Integer id);
    /**
     * 查看一个商品对应的评论列表
     */
    List<Comment> selectByIds(@Param("ids") List<Integer> ids);
    Integer review (@Param("c") Comment comment);
    Comment look (Integer id);
}
