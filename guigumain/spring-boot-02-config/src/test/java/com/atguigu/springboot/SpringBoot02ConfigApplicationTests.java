package com.atguigu.springboot;

import com.atguigu.springboot.bean.Dog;
import com.atguigu.springboot.bean.Person;
import com.atguigu.springboot.service.HelloService;
import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
/*Springboot单元测试
*
* 可以在测试期间很方便的类似编码一样自动注入等容器功能。
*
* */

@SpringBootTest
class SpringBoot02ConfigApplicationTests {
    @Autowired
    Person person;
    @Autowired
    Dog dog;

    //配置AOC容器 (控制反转。)
    @Autowired
    ApplicationContext ioc;

    @Test
    public  void testHelloService(){
       Boolean b = ioc.containsBean("helloService02");
        System.out.println(b);

    }

    @Test
    void contextLoads() {
        System.out.println(person);
        //System.out.println(dog);
    }

}
