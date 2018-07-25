package com.cenjil.boot.api;


import com.cenjil.boot.service.CommentService;
import com.cenjil.entity.Comment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@RequestMapping("/comment")
@Api(tags = "对评论的操作")
public class CommentApi {

    @Autowired
    private CommentService service;

    @PutMapping("/like/{id}")
    @ResponseBody
    @ApiOperation("给评论点赞")
    public String like(@PathVariable("id") Integer id) {
        if (service.like(id)) {
            return "点赞成功!";
        } else {
            return "点赞失败!";
        }
    }
    @PutMapping("/review")
    @ResponseBody
    @ApiOperation("给商品评论")
    public String review (@RequestBody  Comment comment ){
        boolean b;
        b = service.review(comment );
        if(b){
            return "评论成功";
        }
        else{
            return "评论失败";
        }
    }
    @GetMapping("/look/{id}")
    @ResponseBody
    @ApiOperation("查看商品评论")
    public Comment look (@PathVariable("id") Integer id){
        Comment comment = service.look(id);
        return comment;
    }
}
