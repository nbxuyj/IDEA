package com.xuyj.platform.common.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Configuration
@EnableCaching
public class MyCacheConfig {
    @Bean("myKeyGenerator")
    public KeyGenerator keyGenerator()  {
        return new KeyGenerator() {
            public static final int NO_PARAM_KEY = 0;
            @Override
            public Object generate(Object target, Method method, Object... params) {
                StringBuilder key = new StringBuilder();
                return  key.append(target.getClass().getSimpleName()).toString();
            }
        };
    }
}