package com.xuyj.platform.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.xuyj.platform.db.mapper")
@ComponentScan("com.xuyj.platform.service")
public class serverApplication {
    public static void main(String[] args) {
        SpringApplication.run(serverApplication.class,args);
    }
}
