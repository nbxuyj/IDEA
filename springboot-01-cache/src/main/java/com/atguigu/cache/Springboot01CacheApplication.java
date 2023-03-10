package com.atguigu.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 搭建基本环境
 * 1.导入数据库文件。
 * 2.创建javaBean封装数据。
 * 3.整合Mybatis操作数据库。
 *  1.配置数据源。
 *  2.使用注解版本的mybatis。
 *      1）@MapperScan指定要扫描的mapper接口所在的包。
 */
@MapperScan("com.atguigu.cache.mapper")
@SpringBootApplication
@EnableCaching
public class Springboot01CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01CacheApplication.class, args);
    }

}
