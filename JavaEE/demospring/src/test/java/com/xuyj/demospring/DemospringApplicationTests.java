package com.xuyj.demospring;

import com.alibaba.fastjson.JSONObject;
import com.xuyj.demospring.designMode.Composite.Company;
import com.xuyj.demospring.designMode.Composite.ConcreteCompany;
import com.xuyj.demospring.designMode.Composite.FinanceDepartment;
import com.xuyj.demospring.designMode.Composite.HRDepartment;
import com.xuyj.demospring.designMode.abstractFactory.BaseCreateor;
import com.xuyj.demospring.designMode.abstractFactory.CarSettingParamFactory;
import com.xuyj.demospring.designMode.abstractFactory.ShipSettingFactory;
import com.xuyj.demospring.designMode.abstractFactory.pojo.BaseSettingParam;
import com.xuyj.demospring.designMode.adapter._球员.Player;
import com.xuyj.demospring.designMode.adapter._球员.Translator;
import com.xuyj.demospring.designMode.adapter._球员.imp.Center;
import com.xuyj.demospring.designMode.adapter._球员.imp.Forwards;
import com.xuyj.demospring.designMode.adapter._球员.imp.Guards;
import com.xuyj.demospring.designMode.bridge.ClothingCorp;
import com.xuyj.demospring.designMode.bridge.Jacket;
import com.xuyj.demospring.designMode.bridge.Shirt;
import com.xuyj.demospring.designMode.builder.ConcreteBuilder;
import com.xuyj.demospring.designMode.builder.Director;
import com.xuyj.demospring.designMode.builder.pojo.Product;
import com.xuyj.demospring.designMode.decorator.Monkey;
import com.xuyj.demospring.designMode.decorator.TheGreatestSage;
import com.xuyj.demospring.designMode.decorator._具体装饰.Bird;
import com.xuyj.demospring.designMode.decorator._具体装饰.Fish;
import com.xuyj.demospring.designMode.factorymethod.XianRouJiaMoStore;
import com.xuyj.demospring.designMode.prototype.Sheep;
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
    @Test
    void  test原型() throws CloneNotSupportedException {

        System.out.println("原型模式完成对象的创建");

        Sheep sheep1 = new Sheep("tom", 1, "白色");

        //克隆
        Sheep sheep2 = (Sheep)sheep1.clone();
        Sheep sheep3 = (Sheep)sheep1.clone();
        Sheep sheep4 = (Sheep)sheep1.clone();
        Sheep sheep5 = (Sheep)sheep1.clone();

        System.out.println("sheep1=" + JSONObject.toJSONString(sheep1));
        System.out.println("sheep2=" + JSONObject.toJSONString(sheep2));
        System.out.println("sheep3=" + JSONObject.toJSONString(sheep3));
        System.out.println("sheep4=" + JSONObject.toJSONString(sheep4));
        System.out.println("sheep5=" + JSONObject.toJSONString(sheep5));

    }
    @Test
    void testBridge(){
        System.out.println("---桥接模式---");
        System.out.println("---外套这样挣钱---");
        ClothingCorp shirt = new ClothingCorp(new Shirt());
        shirt.makeMoney();

        System.out.println("---内衣这样挣钱---");
        ClothingCorp jacket = new ClothingCorp(new Jacket());
        jacket.makeMoney();

    }
    @Test
    void test组合模式(){
        Company root = new ConcreteCompany();
        root.setName("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));
        Company shandongCom = new ConcreteCompany("山东分公司");
        shandongCom.add(new HRDepartment("山东分公司人力资源部"));
        shandongCom.add(new FinanceDepartment("山东分公司账务部"));
        Company zaozhuangCom = new ConcreteCompany("枣庄办事处");
        zaozhuangCom.add(new FinanceDepartment("枣庄办事处财务部"));
        zaozhuangCom.add(new HRDepartment("枣庄办事处人力资源部"));

        Company jinanCom = new ConcreteCompany("济南办事处");
        jinanCom.add(new FinanceDepartment("济南办事处财务部"));
        jinanCom.add(new HRDepartment("济南办事处人力资源部"));
        shandongCom.add(jinanCom);
        shandongCom.add(zaozhuangCom);
        Company huadongCom = new ConcreteCompany("上海华东分公司");
        huadongCom.add(new HRDepartment("上海华东分公司人力资源部"));
        huadongCom.add(new FinanceDepartment("上海华东分公司账务部"));
        Company hangzhouCom = new ConcreteCompany("杭州办事处");
        hangzhouCom.add(new FinanceDepartment("杭州办事处财务部"));
        hangzhouCom.add(new HRDepartment("杭州办事处人力资源部"));
        Company nanjingCom = new ConcreteCompany("南京办事处");
        nanjingCom.add(new FinanceDepartment("南京办事处财务部"));
        nanjingCom.add(new HRDepartment("南京办事处人力资源部"));

        Company nbCom=new ConcreteCompany("宁波分公司");
        nbCom.add(new HRDepartment("宁波人力资源部"));
        nbCom.add(new HRDepartment("宁波财务部"));

        huadongCom.add(nbCom);
        huadongCom.add(hangzhouCom);
        huadongCom.add(nanjingCom);
        root.add(shandongCom);
        root.add(huadongCom);
        root.display(0);
    }
    @Test
    void test装饰模式(){

            TheGreatestSage sage = new Monkey();
            //第一种写法
//            TheGreatestSage bird = new Bird(sage);
//            bird.move();

            // 第二种写法
            TheGreatestSage fish = new Fish(new Bird(sage));
            fish.move();
    }
    @Test
    void test适配器模式(){
        Player forwards = new Forwards("巴蒂尔");
        forwards.attack();

        Player center = new Center("科比");
        center.attack();

        Player guards = new Guards("詹姆斯");
        guards.attack();

        // 翻译者
        Translator translator = new Translator("姚明");

        translator.attack();
        translator.defense();
    }
}

