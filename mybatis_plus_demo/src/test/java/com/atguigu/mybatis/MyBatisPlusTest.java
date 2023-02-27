package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.sun.javafx.logging.PulseLogger;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    UserMapper userMapper;


    @Test
    public void testSelectList() {
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);

    }

    @Test
    public void testInsert() {
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setEmail("zs@dd.com");

        int res = userMapper.insert(user);
        System.out.println("res:" + res);
        System.out.println("id:" + user.getId());



    }
    @Test
    public  void testDelete(){
      int res=  userMapper.deleteById(0);
        System.out.println("res:" + res);
    }

    @Test
    public  void testDeleteByMap(){

        Map<String,Object> map=new HashMap<>();
        map.put("name","张三");
        map.put("age",23);
        int res=  userMapper.deleteByMap(map);
        System.out.println("res:" + res);
    }


}
