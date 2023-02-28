package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusWrapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
        //查询用户包含a. 年龄在20到30，邮箱不为null的用户信息。
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("user_name", "a")
                .between("age", 20, 30)
                .isNotNull("email");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }

    //测试排序
    @Test
    public void test2() {
        //查询用户，按照年龄的降序排序，再按ID升序。
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("age")
                .orderByAsc("uid");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);

    }

    //组装删除条件。

    @Test
    public void test3() {
        //删除邮箱地址为空的记录。
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("email");
        int result = userMapper.delete(queryWrapper);
        System.out.println("result:" + result);

    }

    @Test
    public void test4() {
        //将用户名中包含有a并且（年龄大于20或邮箱为null）的用户信息修改
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("user_name", "a")
                .ge("age", 20)
                .or()
                .isNull("email");
        User user = new User();
        user.setName("小明");
        user.setEmail("xm@qq.com");
        int res = userMapper.update(user, queryWrapper);
        System.out.println("result:" + res);
    }

    @Test
    public void test5() {
        //条件的优先级
        //将用户名中包含有a并且（年龄大于20或邮箱为null）的用户信息修改
        //UPDATE t_user SET user_name=?, email=? WHERE is_deleted=0 AND (user_name LIKE ? AND (age >= ? OR email IS NULL))
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("user_name", "a")
                .and(q -> q.ge("age", 20)
                .or()
                .isNull("email"));
        User user = new User();
        user.setName("小红");
        user.setEmail("xm@qq.com");

        int res = userMapper.update(user, queryWrapper);
        System.out.println("result:" + res);
    }

    @Test
    public  void test6(){
        //组装select语句。
        //查询用户的用户名、年龄、邮箱信息
        // SELECT user_name,age,email FROM t_user WHERE is_deleted=0
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("user_name","age","email");
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }


}
