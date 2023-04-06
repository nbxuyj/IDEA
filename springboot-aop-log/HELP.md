#2023.03.21
学习AOP切面日志。

SpringBoot注解。 https://www.515code.com/posts/ub6uo96o/

https://www.bilibili.com/video/BV1KT4y1G7hs/?spm_id_from=333.337.search-card.all.click&vd_source=b563cc715acc24e9b3dc95a3745e6771


测试地址：
http://localhost:8080/xuyj/student


1.Controller 与RestController 区别。
2.RequestMapping中的value传参可以加｛｝传递多个。
3.增加server.servlet.context-path: /xuyj 配置项目路径。
4.可以使用@value读取配置文件中的值。

## 2023.03.29
1. RequestParam 传参 /say?id=2222
2. PathVariable 传参 /say/111
   @RequestParam( value = "id",required = false,defaultValue = "888")


## 2023.03.30
1.springboot连接mysql.
步骤：
1.添加连接驱动。
2.配置自动生成表。
jpa:show-sql: true hibernate:ddl-auto: create

## 2023.04.03
配置文件：
需要添加引用
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-configuration-processor</artifactId>
</dependency>

## 2023.04.06
ddl-auto
ddl-auto：create ----每次运行该程序，没有表格会新建表格，表内有数据会清空；
ddl-auto：create-drop ----每次程序结束的时候会清空表
ddl-auto：update ---- 每次运行程序，没有表格会新建表格，表内有数据不会清空，只会更新
ddl-auto： validate ---- 运行程序会校验数据与数据库的字段类型是否相同，不同会报错。

2. 乱码问题：
1）数据库连接串增加characterEncoding=utf-8