package com.cenjil.boot.service;

import com.cenjil.boot.mapper.CommentMapper;
import com.cenjil.boot.mapper.GoodsMapper;
import com.cenjil.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentMapper mapper;


    public boolean like(Integer id) {
       return mapper.like(id)>0;
    }

    public boolean review (Comment comment ){
        boolean b;
        b = mapper.review(comment) > 0;
        return b;
    }
    public Comment look (Integer id){
        Comment comment = mapper.look(id);
        return comment;
    }

}
