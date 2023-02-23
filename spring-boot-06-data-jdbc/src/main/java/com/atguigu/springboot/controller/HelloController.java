package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/query")
    @ResponseBody
    public  Map<String,Object> map(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select  * from department");
        return  maps.get(0);
    }

}
