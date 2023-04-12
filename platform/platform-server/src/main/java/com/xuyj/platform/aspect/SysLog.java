package com.xuyj.platform.aspect;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
/**
 * 标识CRUD日志。
 */
public @interface SysLog {
    String value() default "";
}