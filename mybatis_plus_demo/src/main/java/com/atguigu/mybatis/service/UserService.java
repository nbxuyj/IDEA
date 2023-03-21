package com.atguigu.mybatis.service;

import com.atguigu.mybatis.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Repository;

/*
IServiceUserSerivce继承IService模板提供的基础功能。
*/
@Repository
public interface UserService extends IService<User> {
}
