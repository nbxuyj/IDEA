package com.xuyj.springboot.config;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
/**
 * 创建注解。https://cloud.tencent.com/developer/article/1457465
 */
public @interface SysLog {
    String value() default "";
}