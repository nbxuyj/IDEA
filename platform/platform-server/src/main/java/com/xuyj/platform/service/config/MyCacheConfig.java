package com.xuyj.platform.service.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

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
                key.append(target.getClass().getSimpleName()).append(".").append(method.getName()).append(":");
                if (params.length == 0) {
                    String a = key.append(NO_PARAM_KEY).toString();
                    return a;
                } else {
                    return key.append("[" + Arrays.asList(params).toString() + "]").toString();
                }
            }
        };
    }
}
