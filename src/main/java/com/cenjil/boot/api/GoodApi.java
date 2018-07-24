package com.cenjil.boot.api;

import com.cenjil.boot.service.GoodService;
import com.cenjil.entity.Goods;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller//把当前类注册为路由
@EnableAutoConfiguration
@RequestMapping("good")//类的请求路径
@Api(value = "商品",tags = "用于对商品的操作")
public class GoodApi {

    @Autowired//将服务类GoodService注入路由
    private GoodService service;

    @GetMapping("/find/{id}")//方法的请求路径Get(得到)表示从数据库得到一条数据
    @ResponseBody//方法的响应体下面一个方法就叫这个请求的响应体
    public Goods find(@PathVariable("id") Integer id) {
        return service.findById(id);
    }
//    @PutMapping("/insert")
//    @ResponseBody
//    public boolean insert(@RequestBody Goods goods){
//        return service.insert(goods);
//
//    }
}
