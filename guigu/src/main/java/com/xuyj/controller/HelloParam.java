package com.xuyj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@Api(value = "HelloParam接口说明", tags = "guigu示例")
public class HelloParam {
    @ResponseBody
    @ApiOperation(value = "helloP1传参get", notes = "userID需要传参")
    // @RequestMapping(value="helloP1", method = RequestMethod.GET)
    @GetMapping("helloP1")
    public String HelloParam(String userID) {
        return "Hello " + userID;
    }

    @ApiOperation(value = "helloP2传参post", notes = "food[]")
    @PostMapping("helloP2")
    @ResponseBody
    public Map<String, Object> HelloParam2(String name, @RequestParam(name = "food[]") String[] food) throws Exception {
        Map<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("food", food);
        return result;
    }
}

