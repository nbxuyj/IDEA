package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    //第一种方法。
//    @RequestMapping({"/" , "/index.html"})
//    public String index(){
//        return  "index";
//    }


    @GetMapping("/hello")
    public String Hello() {

        return "hello";
    }

    //查出一些数据，在
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangshan", "lisi", "wangwu"));
        return "success";
    }

}
