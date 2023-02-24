package com.xuyj.main.service;

import com.xuyj.common.responseResult.ResponseResult;
import com.xuyj.main.pojo.User;

public interface UserService {
    /**
     * 通过用户昵称查找用户信息
     * @param name
     * @return
     */
    User findUserByName(String name);
    ResponseResult findUserByName2(String name);
}
