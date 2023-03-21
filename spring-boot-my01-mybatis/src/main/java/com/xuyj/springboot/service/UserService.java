package com.xuyj.springboot.service;

import com.xuyj.springboot.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
