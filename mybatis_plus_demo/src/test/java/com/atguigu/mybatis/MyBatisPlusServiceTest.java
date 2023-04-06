package com.atguigu.mybatis;

import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
public class MyBatisPlusServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetCount() {
        long count = userService.count();
        System.out.println("总记录数：" + count);
    }

    @Test
    public void testSaveBatch() {
        // SQL长度有限制，海量数据插入单条SQL无法实行，
        // 因此MP将批量插入放在了通用Service中实现，而不是通用Mapper
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setName("ybc" + i);
            user.setAge(20 + i);
            users.add(user);
        }
        userService.saveBatch(users);
    }
    @Test
    public  void testQuery(){
       // List<Map<String, Object>> maps = userService.listMaps(new QueryWrapper<>());

        Map<Long, Object> mapCompany = userService.list().stream().collect(Collectors.toMap(User::getId, k->k));


        userService.list().stream()
                .collect(Collectors.toMap(User::getId, User::getName));

        int i=10;
//        Map<String, Object> maps = userService.getMap(null);
//        System.out.println(maps.containsKey(1));
       // maps.forEach(System.out::printf);
    }


}
