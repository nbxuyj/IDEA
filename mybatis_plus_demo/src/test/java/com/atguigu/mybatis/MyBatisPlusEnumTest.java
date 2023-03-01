package com.atguigu.mybatis;

import com.atguigu.mybatis.enums.SexEnum;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusEnumTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    private  void test(){
        User user=new User();
        user.setName("admin");
        user.setAge(33);
        user.setSex(SexEnum.FEMALE);
        int result = userMapper.insert(user);
        System.out.println("result+"+result);

    }
}
