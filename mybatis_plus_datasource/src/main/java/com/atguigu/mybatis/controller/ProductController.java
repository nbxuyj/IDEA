package com.atguigu.mybatis.controller;


import com.atguigu.mybatis.entity.Product;
import com.atguigu.mybatis.entity.User;
import com.atguigu.mybatis.service.IProductService;
import com.atguigu.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author atguigu
 * @since 2023-03-02
 */
@Controller
@RequestMapping("/mybatis/product")
public class ProductController {
    @Autowired
    IProductService myService;


    @ResponseBody
    @GetMapping("/get")
    public String GetUserInfo() {
        Product service = myService.getById(1);
        return service.toString() ;
    }
}
