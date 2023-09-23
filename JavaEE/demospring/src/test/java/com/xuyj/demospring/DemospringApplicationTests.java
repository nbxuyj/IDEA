package com.xuyj.demospring;

import com.xuyj.demospring.designMode.abstractFactory.BaseCreateor;
import com.xuyj.demospring.designMode.abstractFactory.CarSettingParamFactory;
import com.xuyj.demospring.designMode.abstractFactory.ShipSettingFactory;
import com.xuyj.demospring.designMode.abstractFactory.pojo.BaseSettingParam;
import com.xuyj.demospring.designMode.builder.ConcreteBuilder;
import com.xuyj.demospring.designMode.builder.Director;
import com.xuyj.demospring.designMode.builder.pojo.Product;
import com.xuyj.demospring.designMode.factorymethod.XianRouJiaMoStore;
import com.xuyj.demospring.designMode.simplefatory.RoujiaMoStore;
import com.xuyj.demospring.designMode.simplefatory.SimpleRouJiaMoFactroy;
import com.xuyj.demospring.designMode.simplefatory.pojo.RouJiaMo;
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
    @Test
    void test工厂方法模式(){

        //https://blog.csdn.net/lmj623565791/article/details/24460585
        var store= new XianRouJiaMoStore();
        store.createRouJiaMo("Tian");
        store.sellRouJiaMoV2();

    }
    @Test
    void test抽象工厂模式(){
        //创建二个工厂，输出参数
        BaseCreateor shipFactory = new ShipSettingFactory();
        BaseCreateor carFactory = new CarSettingParamFactory();
        System.out.println(shipFactory.CreateSettinParamFactory().toString());
        System.out.println(carFactory.CreateSettinParamFactory().toString());
    }
    @Test
    void test建造者()    {
        Director director = new Director();
        Product create = director.create(new ConcreteBuilder());
        System.out.println(create.toString());
    }
}

