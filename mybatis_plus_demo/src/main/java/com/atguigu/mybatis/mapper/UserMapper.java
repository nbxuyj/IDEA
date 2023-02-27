package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper extends BaseMapper<User> {
   /* 根据id查询用户信息的map集合*/
    Map<String,Object> selectMapByID(Long id);
}
