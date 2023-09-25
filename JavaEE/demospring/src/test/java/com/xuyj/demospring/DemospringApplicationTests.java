package com.xuyj.demospring;

import com.alibaba.fastjson.JSONObject;
import com.xuyj.demospring.designMode.Composite.Company;
import com.xuyj.demospring.designMode.Composite.ConcreteCompany;
import com.xuyj.demospring.designMode.Composite.FinanceDepartment;
import com.xuyj.demospring.designMode.Composite.HRDepartment;
import com.xuyj.demospring.designMode.Iterator.StudentAggregate;
import com.xuyj.demospring.designMode.Iterator.StudentIterator;
import com.xuyj.demospring.designMode.Iterator.impl.StudentAggregateImpl;
import com.xuyj.demospring.designMode.Iterator.pojo.Student;
import com.xuyj.demospring.designMode.abstractFactory.BaseCreateor;
import com.xuyj.demospring.designMode.abstractFactory.CarSettingParamFactory;
import com.xuyj.demospring.designMode.abstractFactory.ShipSettingFactory;
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
import com.xuyj.demospring.designMode.chain.LengthCheckProcessor;
import com.xuyj.demospring.designMode.chain.ProcessorChain;
import com.xuyj.demospring.designMode.chain.WidthCheckProcessor;
import com.xuyj.demospring.designMode.command.Command;
import com.xuyj.demospring.designMode.command.ConcreteCommand;
import com.xuyj.demospring.designMode.command.Invoker;
import com.xuyj.demospring.designMode.decorator.Monkey;
import com.xuyj.demospring.designMode.decorator.TheGreatestSage;
import com.xuyj.demospring.designMode.decorator._具体装饰.Bird;
import com.xuyj.demospring.designMode.decorator._具体装饰.Fish;
import com.xuyj.demospring.designMode.facade.ECommerceFacade;
import com.xuyj.demospring.designMode.factorymethod.XianRouJiaMoStore;
import com.xuyj.demospring.designMode.flyweight.CharacterFactory;
import com.xuyj.demospring.designMode.flyweight.ICharacter;
import com.xuyj.demospring.designMode.flyweight.pojo.CharacterStyle;
import com.xuyj.demospring.designMode.interpreterV2.AdvanceExpression;
import com.xuyj.demospring.designMode.interpreterV2.Context;
import com.xuyj.demospring.designMode.interpreterV2.Expression;
import com.xuyj.demospring.designMode.interpreterV2.SimpleExpression;
import com.xuyj.demospring.designMode.mediator.*;
import com.xuyj.demospring.designMode.memento.ArticleCaretaker;
import com.xuyj.demospring.designMode.memento.ArticleMemento;
import com.xuyj.demospring.designMode.memento.ArticleText;
import com.xuyj.demospring.designMode.observer.impl.Boss;
import com.xuyj.demospring.designMode.observer.impl.Employee;
import com.xuyj.demospring.designMode.prototype.Sheep;
import com.xuyj.demospring.designMode.proxy.Movie;
import com.xuyj.demospring.designMode.proxy.MovieStaticProxy;
import com.xuyj.demospring.designMode.proxy.impl.CaptainAmericaMovie;
import com.xuyj.demospring.designMode.proxydynamix.MyInvocationHandler;
import com.xuyj.demospring.designMode.proxydynamix.VIPMovie;
import com.xuyj.demospring.designMode.proxydynamix.impl.IronManVIPMovie;
import com.xuyj.demospring.designMode.simplefatory.RoujiaMoStore;
import com.xuyj.demospring.designMode.simplefatory.SimpleRouJiaMoFactroy;
import com.xuyj.demospring.designMode.state.JdLogistics;
import com.xuyj.demospring.designMode.state.OrderState;
import com.xuyj.demospring.designMode.state.ProductOutState;
import com.xuyj.demospring.designMode.state.TransportState;
import com.xuyj.demospring.designMode.strategy.AlipayPaymentStrategy;
import com.xuyj.demospring.designMode.strategy.PaymentService;
import com.xuyj.demospring.designMode.strategy.WechatPaymentStrategy;
import com.xuyj.demospring.designMode.tmpplate.AbstractClass;
import com.xuyj.demospring.designMode.tmpplate.ConcreteClass1;
import com.xuyj.demospring.designMode.tmpplate.ConcreteClass2;
import com.xuyj.demospring.designMode.visitor.BigHuYouCompany;
import com.xuyj.demospring.designMode.visitor.LiveApp;
import com.xuyj.demospring.designMode.visitor.SocialApp;
import com.xuyj.demospring.entity.Man;
import com.xuyj.demospring.entity.User;
import lombok.var;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sound.midi.Receiver;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.Date;

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
    void test建造者模式() {
        User user = new User.UserBuilder().password("sss").username("ssss").build();
    }


    @Test
    void test简单工厂模式() {
        //https://blog.csdn.net/lmj623565791/article/details/24460585
        var store = new RoujiaMoStore(new SimpleRouJiaMoFactroy());
        store.sellRouJiaMoV2("La");
    }

    @Test
    void test工厂方法模式() {

        //https://blog.csdn.net/lmj623565791/article/details/24460585
        var store = new XianRouJiaMoStore();
        store.createRouJiaMo("Tian");
        store.sellRouJiaMoV2();

    }

    @Test
    void test抽象工厂模式() {
        //创建二个工厂，输出参数
        BaseCreateor shipFactory = new ShipSettingFactory();
        BaseCreateor carFactory = new CarSettingParamFactory();
        System.out.println(shipFactory.CreateSettinParamFactory().toString());
        System.out.println(carFactory.CreateSettinParamFactory().toString());
    }

    @Test
    void test建造者() {
        Director director = new Director();
        Product create = director.create(new ConcreteBuilder());
        System.out.println(create.toString());
    }

    @Test
    void test原型() throws CloneNotSupportedException {

        System.out.println("原型模式完成对象的创建");

        Sheep sheep1 = new Sheep("tom", 1, "白色");

        //克隆
        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        Sheep sheep4 = (Sheep) sheep1.clone();
        Sheep sheep5 = (Sheep) sheep1.clone();

        System.out.println("sheep1=" + JSONObject.toJSONString(sheep1));
        System.out.println("sheep2=" + JSONObject.toJSONString(sheep2));
        System.out.println("sheep3=" + JSONObject.toJSONString(sheep3));
        System.out.println("sheep4=" + JSONObject.toJSONString(sheep4));
        System.out.println("sheep5=" + JSONObject.toJSONString(sheep5));

    }

    @Test
    void testBridge() {
        System.out.println("---桥接模式---");
        System.out.println("---外套这样挣钱---");
        ClothingCorp shirt = new ClothingCorp(new Shirt());
        shirt.makeMoney();

        System.out.println("---内衣这样挣钱---");
        ClothingCorp jacket = new ClothingCorp(new Jacket());
        jacket.makeMoney();

    }

    @Test
    void test组合模式() {
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

        Company nbCom = new ConcreteCompany("宁波分公司");
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
    void test装饰模式() {

        TheGreatestSage sage = new Monkey();
        //第一种写法
//            TheGreatestSage bird = new Bird(sage);
//            bird.move();

        // 第二种写法
        TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();
    }

    @Test
    void test适配器模式() {
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

    @Test
    void test外观模式() {
        ECommerceFacade facade = new ECommerceFacade();
        facade.placeOrder("P123", "Credit Card", "123 Main St");
    }

    @Test
    void test享元模式() {
        CharacterFactory characterFactory = new CharacterFactory();

        CharacterStyle style1 = new CharacterStyle("Arial", 12, "Black");
        CharacterStyle style2 = new CharacterStyle("Arial", 12, "Red");

        ICharacter a1 = characterFactory.getCharacter('A');
        a1.display(style1);

        ICharacter a2 = characterFactory.getCharacter('A');
        a2.display(style2);

        ICharacter b1 = characterFactory.getCharacter('B');
        b1.display(style1);
    }

    @Test
    void test静态代理模式() {

        Movie captainAmericaMovie = new CaptainAmericaMovie();
        Movie movieStaticProxy = new MovieStaticProxy(captainAmericaMovie);
        movieStaticProxy.play();
    }

    @Test
    void test动态代理() {

        // VIP 影厅《钢铁侠》
        IronManVIPMovie ironManVIPMovie = new IronManVIPMovie();
        InvocationHandler invocationHandler = new MyInvocationHandler(ironManVIPMovie);
        VIPMovie dynamicProxy = (VIPMovie) Proxy.newProxyInstance(IronManVIPMovie.class.getClassLoader(),
                IronManVIPMovie.class.getInterfaces(), invocationHandler);
        dynamicProxy.vipPlay();


        // 普通影厅《美国队长》
        CaptainAmericaMovie captainAmericaMovie = new CaptainAmericaMovie();
        InvocationHandler invocationHandler1 = new MyInvocationHandler(captainAmericaMovie);
        Movie dynamicProxy1 = (Movie) Proxy.newProxyInstance(CaptainAmericaMovie.class.getClassLoader(),
                CaptainAmericaMovie.class.getInterfaces(), invocationHandler1);
        dynamicProxy1.play();
    }

    @Test
    void test责任链() {
        int[][] arrays = {{60, 60}, {40, 40}, {40, 60}, {60, 40}};
        for (int[] array : arrays) {
            ProcessorChain processorChain = new ProcessorChain();
            processorChain.addProcessor(new LengthCheckProcessor());
            processorChain.addProcessor(new WidthCheckProcessor());

            com.xuyj.demospring.designMode.chain.pojo.Product product = new com.xuyj.demospring.designMode.chain.pojo.Product(array[0], array[1]);
            boolean checkResult = processorChain.process(product, processorChain);
            if (checkResult) {
                System.out.println("产品最终检验合格");
            } else {
                System.out.println("产品最终检验不合格");
            }
            System.out.println();


        }


    }
    @Test
    void test解析器(){
        Context ctx = new Context();
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());
        ctx.add(new SimpleExpression());
        for (Expression eps : ctx.getList()) {
            eps.interpret(ctx);
        }
    }
    @Test
    void test模板(){
        AbstractClass abstractClass1 = new ConcreteClass1();
        AbstractClass abstractClass2 = new ConcreteClass2();
        applyTemplate(abstractClass1);
        applyTemplate(abstractClass2);
    }
    public static void applyTemplate(AbstractClass abstractClass){
        abstractClass.templateMethod();
    }
    @Test
    void test命令模式(){
        com.xuyj.demospring.designMode.command.Receiver r = new com.xuyj.demospring.designMode.command.Receiver();
        Command c = new ConcreteCommand(r);
        Invoker i = new Invoker();
        i.SetCommand(c);
        i.ExecuteCommand();
    }
    @Test
    void test迭代器(){
        // 创建 3 个学生对象
        Student tom = new Student("Tom");
        Student jerry = new Student("Jerry");
        Student trump = new Student("Trump");

        // 构造学生对象集合
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(tom);
        studentAggregate.addStudent(jerry);
        studentAggregate.addStudent(trump);

        // 获取学生对象的迭代器
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        // 判断是否是最后一个对象 , 如果不是 , 获取下一个对象 , 并打印
        while (!studentIterator.isLast()) {
            Student student = studentIterator.nextStudent();
            System.out.println(student);
        }

        // 删除一个对象
        studentAggregate.removeStudent(trump);
        System.out.println("删除 Trump" );

        studentIterator = studentAggregate.getStudentIterator();
        // 判断是否是最后一个对象 , 如果不是 , 获取下一个对象 , 并打印
        while (!studentIterator.isLast()) {
            Student student = studentIterator.nextStudent();
            System.out.println(student);
        }

    }
    @Test
    void test中介者模式(){
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
    @Test
    void test备忘录(){

        ArticleCaretaker articleCaretaker = new ArticleCaretaker();

        ArticleText articleText = new ArticleText("标题1","内容1",new Date());
        ArticleMemento articleMemento = articleText.saveToMemento();
        articleCaretaker.setArticle(articleMemento);//备忘1次

        articleText = new ArticleText("标题2","内容2",new Date());
        System.out.println(String.format("修改后的标题为【%s】，内容为【%s】",articleText.getTitle(),articleText.getContent()));

        articleText.getArticleFromMemento(articleCaretaker.getArticle(0));
        System.out.println(String.format("还原后的标题为【%s】，内容为【%s】",articleText.getTitle(),articleText.getContent()));
    }
    @Test
    void test观察者模式(){
        Boss boss = new Boss("老板发布放假通知");
        Employee emp = new Employee("张三");
        Employee emp1 = new Employee("李四");
        Employee emp2 = new Employee("王五");
        boss.AddSubscriber(emp);
        boss.AddSubscriber(emp1);
        boss.AddSubscriber(emp2);
        boss.Publish();
    }
    @Test
    void test状态模式(){
        //状态的保持与切换者
        JdLogistics jdLogistics = new JdLogistics();

        //接单状态
        OrderState orderState = new OrderState();
        jdLogistics.setLogisticsState(orderState);
        jdLogistics.doAction();

        //出库状态
        ProductOutState productOutState = new ProductOutState();
        jdLogistics.setLogisticsState(productOutState);
        jdLogistics.doAction();

        //运输状态
        TransportState transportState = new TransportState();
        jdLogistics.setLogisticsState(transportState);
        jdLogistics.doAction();
    }
    @Test
    void test策略模式(){
        PaymentService paymentService = new PaymentService();
        // 使用微信支付
        paymentService.payment(new WechatPaymentStrategy(), new BigDecimal("100"));
        //使用支付宝支付
        paymentService.payment(new AlipayPaymentStrategy(), new BigDecimal("100"));

    }
    @Test

    void test访问都模式(){
        BigHuYouCompany bigHuYou= new BigHuYouCompany();
        //可以很轻松的更换Visitor，但是要求BigHuYouCompany的结构稳定
        System.out.println("-----------------启动社交APP项目--------------------");
        bigHuYou.startProject(new SocialApp());
        System.out.println("-----------------启动短视频APP项目--------------------");
        bigHuYou.startProject(new LiveApp());
    }
}