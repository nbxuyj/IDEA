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

import java.util.Arrays;
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
    public void testDelete() {
        int res = userMapper.deleteById(0);
        System.out.println("res:" + res);
    }

    @Test
    public void testDeleteByMap() {
        //==>  Preparing: DELETE FROM user WHERE name = ? AND age = ?
        //==> Parameters: 张三(String), 23(Integer)
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 23);
        int res = userMapper.deleteByMap(map);
        System.out.println("res:" + res);
    }

    @Test
    public void testDeleteBatchIds() {
        //通过多个id批量删除。
        //==>  Preparing: DELETE FROM user WHERE id IN ( ? , ? , ? )
        //==> Parameters: 1(Long), 2(Long), 3(Long)
        List<Long> idList = Arrays.asList(1L, 2L, 3L);
        int result = userMapper.deleteBatchIds(idList);
        System.out.println("受影响的行数:+" + result);

    }

    //修改：
    @Test
    public void testUpdateById() {
        //==>  Preparing: UPDATE user SET name=?, age=? WHERE id=?
        //==> Parameters: admin(String), 22(Integer), 4(Long)
        User user = new User(4L, "admin", 22, null);
        int result = userMapper.updateById(user);
        System.out.println("受影响的行数:+" + result);

    }

    @Test
    //查询。
    public void testSelectById() {
        //根据id查询用户信息
        //SELECT id,name,age,email FROM user WHERE id=?
        User user = userMapper.selectById(4L);
        System.out.println(user);

    }

    @Test
    public void testSelectBatchIds() {
        //根据多个id查询多个用户信息
        //SELECT id,name,age,email FROM user WHERE id IN ( ? , ? )
        List<Long> idList = Arrays.asList(4L, 5L);
        List<User> list = userMapper.selectBatchIds(idList);
        list.forEach(System.out::println);
    }

    @Test
    public void testselectByMap() {
        //通过map条件查询用户信息
        //SELECT id,name,age,email FROM user WHERE name = ? AND age = ?
        Map<String, Object> map = new HashMap<>();
        map.put("age", 22);
        map.put("name", "admin");
        List<User> list = userMapper.selectByMap(map);
        list.forEach(System.out::println);


    }
}
