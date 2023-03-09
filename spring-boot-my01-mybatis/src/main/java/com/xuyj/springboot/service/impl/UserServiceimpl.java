package com.xuyj.springboot.service.impl;

import com.xuyj.springboot.entity.User;
import com.xuyj.springboot.mapper.UserMapper;
import com.xuyj.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService") //需要在接口实现类中使用@Service注解，才能被SpringBoot扫描，在Controller中使用@Authwired注入
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
