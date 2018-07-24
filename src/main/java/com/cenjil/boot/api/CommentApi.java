package com.cenjil.boot.api;


import com.cenjil.boot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@RequestMapping("/comment")
public class CommentApi {

    @Autowired
    private CommentService service;

    @PutMapping("/like/{id}")
    @ResponseBody
    public String like(@PathVariable("id") Integer id) {
        boolean b = service.like(id);
        if (b) {
            return "点赞成功!";
        } else {
            return "点赞失败!";
        }
    }
}
