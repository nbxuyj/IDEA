package com.xuyj.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuyj.springboot.mapper")//使用MapperScan批量扫描所有的Mapper接口；
public class SpringBootMy01MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMy01MybatisApplication.class, args);
    }

}
