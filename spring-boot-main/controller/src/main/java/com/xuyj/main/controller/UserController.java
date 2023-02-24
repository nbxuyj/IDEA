package com.xuyj.main.controller;

import com.xuyj.main.pojo.User;
import com.xuyj.main.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "Hello接口说明",tags = "guigu示例")
public class UserController {

    @Autowired
    private UserService userService;
    @ApiOperation(value = "hello无参",notes = "这是第一个hello方法")
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public User findByName(String name){
        return userService.findUserByName(name);
    }
}