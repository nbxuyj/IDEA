package com.xuyj.demospring;

import com.xuyj.demospring.designMode.simplefatory.RoujiaMoStore;
import com.xuyj.demospring.designMode.simplefatory.SimpleRouJiaMoFactroy;
import com.xuyj.demospring.entity.Man;
import com.xuyj.demospring.entity.User;
import lombok.var;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.lang.model.element.Name;

/**
 * https://blog.csdn.net/lmj623565791/article/details/24460585
 */
@SpringBootTest
class DemospringApplicationTests {

    @Test
    void contextLoads() {
        Man man = new Man("张三");
        System.out.println(man.getName());

    }

    @Test
    void test享元设计模式() {
        System.out.println(Integer.valueOf(10) == Integer.valueOf(10));
        System.out.println(Integer.valueOf(100) == Integer.valueOf(100));
        System.out.println(Integer.valueOf(129) == Integer.valueOf(129));
        //原文链接：https://blog.csdn.net/qq_37291761/article/details/84546455
    }
    @Test
    void test建造者模式(){
        User user = new User.UserBuilder().password("sss").username("ssss").build();
    }
    @Test
    void test简单工厂模式(){
        //https://blog.csdn.net/lmj623565791/article/details/24460585
        var store= new  RoujiaMoStore(new SimpleRouJiaMoFactroy());
        store.sellRouJiaMoV2("La");

    }
}

