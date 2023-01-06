package com.xuyj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@Api(value = "HelloParam接口说明", tags = "接口说明")
public class HelloParam {
    @ResponseBody
    @ApiOperation(value = "Get传参", notes = "userID需要添加")
    @RequestMapping(value="helloParam", method = RequestMethod.GET)
    public String HelloParam(String userID) {
        return "Hello " + userID;
    }

    @ApiOperation(value = "Post传参", notes = "food[]")
    @RequestMapping(value = "helloP2", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> HelloParam2(String name, @RequestParam(name = "food[]") String[] food) throws Exception {
        Map<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("food", food);
        return result;
    }
}

