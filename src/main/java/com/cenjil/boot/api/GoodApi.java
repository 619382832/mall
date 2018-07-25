package com.cenjil.boot.api;

import com.cenjil.boot.service.GoodService;
import com.cenjil.dto.GoodDto;
import com.cenjil.param.GoodParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller//把当前类注册为路由
@EnableAutoConfiguration
@RequestMapping("good")//类的请求路径
@Api(tags = "对商品的操作")
public class GoodApi {

    @Autowired//将服务类GoodService注入路由
    private GoodService service;

    @PutMapping("/add")
    @ResponseBody
    @ApiOperation("上架商品")
    public String add(@RequestBody GoodParam goodParam) {
        if (service.add(goodParam)) {
            return "上架成功!";
        } else {
            return "上架失败!";
        }
    }

    @GetMapping("/find/{id}")//方法的请求路径Get(得到)表示从数据库得到一条数据
    @ResponseBody//方法的响应体下面一个方法就叫这个请求的响应体
    @ApiOperation("查看商品详情")
    public GoodDto find(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @PutMapping("/update")
    @ResponseBody
    @ApiOperation("修改商品信息")
    public String update(@RequestBody GoodParam goodParam) {
        if (service.update(goodParam)) {
            return "修改成功!";
        } else {
            return "修改失败!";
        }
    }


}
