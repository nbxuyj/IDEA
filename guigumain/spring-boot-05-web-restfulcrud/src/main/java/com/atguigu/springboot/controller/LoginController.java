package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

@Controller
public class LoginController {
//    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @PostMapping("/user/login")
    public String login(@RequestParam String username,
                        @RequestParam  String password,
                        Map<String,Object>map
                        ){

        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            //登陆成功，防止表单提交，可以重定向。
            return "redirect:/main.html";
//            return "dashboard";
        }else
        {
            map.put("msg","用户名密码错误");
            //登陆错误，返回登陆页面。
            return "login";

        }

    }
}
