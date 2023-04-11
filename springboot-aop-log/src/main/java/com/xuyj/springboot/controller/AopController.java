package com.xuyj.springboot.controller;

import com.xuyj.springboot.config.SysLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Aop接口")
@RestController
@RequestMapping("/aop")
public class AopController {
    @ApiOperation("测试")
    @SysLog("测试")
    @GetMapping("/test")
    public String test(@RequestParam("name") String name,@RequestParam("age") Integer age){

    return "";
    }
}
