package com.xuyj.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(value = "Hello接口说明", tags = "guigu示例")
public class HelloController {
    @ResponseBody
    @ApiOperation(value = "hello无参", notes = "这是第一个hello方法")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello w1010!";
    }
}
