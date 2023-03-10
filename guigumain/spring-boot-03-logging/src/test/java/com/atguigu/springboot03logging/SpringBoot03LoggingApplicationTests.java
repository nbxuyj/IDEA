package com.atguigu.springboot03logging;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {
    ///记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {

        //日志的级别：由低到高。
        //可以调整输出的日志级别: 日志就会在这个级别及以后的高级别生效。
        // 默认的Info级别。
        logger.trace("这是track日志....");
        logger.debug("这是debug日志...");
        // SpringBoot默认给我们使用的是info级别，没有指定级别就用SpringBoot默认规定的级别：root级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }

}
