package com.xuyj.platform.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xuyj.platform.db.mapper"})
public class serverApplication {
    public static void main(String[] args) {
        SpringApplication.run(serverApplication.class,args);
    }
}
