package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusPluginTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public  void testPage(){
        Page<User>page=new Page<>(2,3);
        userMapper.selectPage(page,null);
        System.out.println(page);
    }

}
