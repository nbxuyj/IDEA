package com.xuyj.springboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "todo")
@EnableConfigurationProperties(TodoConfig.class)
@Data
@Component
public class TodoConfig {
    private String date;
    private String thing;
}
