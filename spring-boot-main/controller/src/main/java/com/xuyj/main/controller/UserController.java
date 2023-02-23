package com.xuyj.main.controller;

import com.xuyj.main.pojo.User;
import com.xuyj.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public User findByName(String name){
        return userService.findUserByName(name);
    }
}