package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusWrapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test01(){
        //查询用户包含a. 年龄在20到30，邮箱不为null的用户信息。
        QueryWrapper<User> queryWrapper=new  QueryWrapper<>();
        queryWrapper.like("user_name","a")
                .between("age",20,30)
                .isNotNull("email");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    //测试排序
    @Test
    public  void test2(){
        //查询用户，按照年龄的降序排序，再按ID升序。
        QueryWrapper<User> queryWrapper=new  QueryWrapper<>();
        queryWrapper.orderByDesc("age")
                .orderByAsc("uid");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);

    }
}
