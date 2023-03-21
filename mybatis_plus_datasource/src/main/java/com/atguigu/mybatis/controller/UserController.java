package com.atguigu.mybatis.controller;


import com.atguigu.mybatis.entity.User;
import com.atguigu.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2023-03-02
 */
@Controller
@RequestMapping("/mybatis/user")
public class UserController {
    @Autowired
    IUserService myService;


    @ResponseBody
    @GetMapping("/get")
    public String GetUserInfo() {
        User user = myService.getById(1);
        return user.toString();
    }
}
