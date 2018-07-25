package com.cenjil.boot.service;

import com.cenjil.boot.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentMapper mapper;

    public boolean like(Integer id) {
       return mapper.like(id)>0;
    }


}
