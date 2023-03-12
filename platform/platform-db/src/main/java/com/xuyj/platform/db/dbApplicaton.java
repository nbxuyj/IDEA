package com.xuyj.platform.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.xuyj.platform.db.mapper")
public class dbApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(dbApplicaton.class,args);
    }
}
