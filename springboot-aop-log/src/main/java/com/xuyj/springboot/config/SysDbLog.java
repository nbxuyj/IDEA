package com.xuyj.springboot.config;

import com.xuyj.springboot.enums.OperEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.annotation.*;

/**
 * 用于写数据库日志。
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysDbLog {
    //用于显示写日志的名称
    String value() default "";
    OperEnum  method() default  OperEnum.查询;
}
