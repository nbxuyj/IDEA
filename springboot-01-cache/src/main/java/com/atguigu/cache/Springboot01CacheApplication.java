package com.atguigu.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 *一、搭建基本环境
 * 1.导入数据库文件。
 * 2.创建javaBean封装数据。
 * 3.整合Mybatis操作数据库。
 *  1.配置数据源。
 *  2.使用注解版本的mybatis。
 *      1）@MapperScan指定要扫描的mapper接口所在的包。
 *二、快速体验缓存
 * 步骤：
 * 1.开启基于注解的缓存。(在Application类中增加@EnableCaching.)
 * 2.标注缓存的注解即可。
 *
 *
 *
 *笔记：
 *Cache	缓存接口，定义缓存操作。实现有：RedisCache、EhCacheCache、ConcurrentMapCache等
 * CacheManager	缓存管理器，管理各种缓存（Cache）组件
 * @Cacheable 主要针对方法配置，能够根据方法的请求参数对其结果进行缓存
 * @CacheEvict 清空缓存
 * @CachePut 保证方法被调用，又希望结果被缓存。
 * @EnableCaching 开启基于注解的缓存
 * keyGenerator	缓存数据时key生成策略
 * serialize	缓存数据时value序列化策略
 *
 *
 *
 *
 */
@MapperScan("com.atguigu.cache.mapper")
@SpringBootApplication
@EnableCaching
public class Springboot01CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01CacheApplication.class, args);
    }

}
