package com.xuyj.main.controller;

import com.xuyj.common.responseResult.ResponseResult;
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
@Api(value = "User控制器接口说明", tags = "Swagger测试")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "根据姓名查询用户", notes = "这是备注说明")
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public User findByName(String name) {
        return userService.findUserByName(name);
    }

    @ApiOperation(value = "根据姓名查询用户", notes = "这是备注说明")
    @RequestMapping(value = "/find2", method = RequestMethod.GET)
    public ResponseResult findByName2(String name) {
        return userService.findUserByName2(name);
    }
}