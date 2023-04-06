package com.xuyj.platform.manage.api;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
@MapperScan("com.xuyj.platform.db.mapper")
@ComponentScan( value = {"com.xuyj.platform","com.xuyj.platform.service"})
public class apiApplication {
    public static void main(String[] args) {
        SpringApplication.run(apiApplication.class, args);
    }

}
