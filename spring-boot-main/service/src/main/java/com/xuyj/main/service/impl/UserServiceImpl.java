package com.xuyj.main.service.impl;

import com.xuyj.main.dao.UserDao;
import com.xuyj.main.pojo.User;
import com.xuyj.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserByName(String name) {
        return userDao.findByName(name).orElse(null);
    }
}