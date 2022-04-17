package com.pkurw.bookstore.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuyizhe <yyz@stu.pku.edu.cn>
 * Created on 2022-04-17
 * @description：TODO
 */
@RestController
public class HelloController {

    @ApiOperation("可以指定参数的API")

    @GetMapping("/param")

    public String hello2(@ApiParam("用户名") String name){
        System.out.println("111");
        return name;
    }

}