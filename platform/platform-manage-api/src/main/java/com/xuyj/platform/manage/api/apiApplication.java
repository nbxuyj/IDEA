package com.xuyj.platform.manage.api;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.xuyj.platform.db.mapper")
@ComponentScan("com.xuyj.platform.service")
public class apiApplication {
    public static void main(String[] args) {
        SpringApplication.run(apiApplication.class,args);
    }

}
