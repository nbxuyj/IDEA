package com.atguigu.mybatis.service.impl;

import com.atguigu.mybatis.entity.User;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.service.IUserService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author atguigu
 * @since 2023-03-02
 */
@DS("master") //指定所操作的数据源
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
