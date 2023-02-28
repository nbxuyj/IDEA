package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
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
    public void test6() {
        //组装select语句。
        //查询用户的用户名、年龄、邮箱信息
        // SELECT user_name,age,email FROM t_user WHERE is_deleted=0
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("user_name", "age", "email");
        List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }

    //组装子查询。
    @Test
    public void test7() {
        //查询ID小于等于100的用户信息。
        //SELECT uid AS id,user_name AS name,age,email,is_deleted FROM t_user WHERE is_deleted=0 AND (uid IN (SELECT uid from t_user WHERE uid<=3))
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("uid", "SELECT uid from t_user WHERE uid<=3");
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }
//===================QueryWrapper用于查询、删除、修改。
    //updateWapper可以设置条件，

    @Test
    public void test08() {
        //UPDATE t_user SET user_name=?,email=? WHERE is_deleted=0 AND (user_name LIKE ? AND (age >= ? OR email IS NULL))
        //将用户名中包含有a并且（年龄大于20或邮箱为null）的用户信息修改
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.like("user_name", "a")
                .and(i -> i.ge("age", 20).or().isNull("email"));

        updateWrapper.set("user_name", "小黑").set("email", "abc@atguigu.com");
        int res = userMapper.update(null, updateWrapper);
        System.out.println("result:" + res);
    }

    //===================组合条件===================
    @Test
    public void test09() {
        //==>  Preparing: SELECT uid AS id,user_name AS name,age,email,is_deleted FROM t_user WHERE is_deleted=0 AND (age >= ? AND age <= ?)
        String userName = "a";
        Integer ageBegin = null;
        Integer ageEnd = 30;
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotBlank(userName)){
            //不为空，不为null，不为空白符
            queryWrapper.like("user_name",userName);
        }
        if (ageBegin!=null){
            queryWrapper.ge("age",ageBegin);
        }

        if (ageEnd!=null){
            queryWrapper.le("age",ageEnd);
        }
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }
    //===================组合条件（使用condition）===================
    @Test
    public  void test10(){
        String userName = "a";
        Integer ageBegin = null;
        Integer ageEnd = 30;
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(userName),"user_name",userName)
                .ge(ageBegin!=null,"age",ageBegin)
                .le(ageEnd!=null,"age",ageEnd);
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);
    }
    //===================LambdaQueryWrapper===================
    @Test
    public void test11(){
        //SELECT uid AS id,user_name AS name,age,email,is_deleted FROM t_user WHERE is_deleted=0 AND (user_name LIKE ? AND age >= ?)
        //防止用户名写错。
        String userName = "a";
        Integer ageBegin = null;
        Integer ageEnd = 30;
        LambdaQueryWrapper<User>queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(userName), User::getName,userName)
                .le(ageBegin!=null,User::getAge,ageBegin)
                .ge(ageEnd!=null,User::getAge,ageEnd);
        List<User> list = userMapper.selectList(queryWrapper);
        list.forEach(System.out::println);

    }

}
