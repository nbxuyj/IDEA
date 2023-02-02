package com.atguigu.springboot.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.security.PublicKey;

//全面接管
//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        //浏览器发送atguigu请求
        registry.addViewController("/atguigu").setViewName("success");
    }

    @Bean //将组件注册在容器中。
    public  WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
      WebMvcConfigurerAdapter adapter=  new WebMvcConfigurerAdapter(){
          @Override
          public void addViewControllers(ViewControllerRegistry registry) {
              registry.addViewController("/").setViewName("login");
              registry.addViewController("/login.html").setViewName("login");
          }
      }  ;
      return  adapter;
    }

}
