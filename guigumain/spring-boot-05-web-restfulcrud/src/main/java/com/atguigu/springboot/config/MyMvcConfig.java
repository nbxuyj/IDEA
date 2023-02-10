package com.atguigu.springboot.config;

import com.atguigu.springboot.component.LoginHandlerInterceptor;
import com.atguigu.springboot.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        //浏览器发送 /atguigu
        registry.addViewController("/atguigu").setViewName("success");
    }

    @Bean
    //所有的WebMvcConfigurerAdapter组件都会一起起作用。
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter =new WebMvcConfigurerAdapter() {

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            //注册拦截器。
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //拦截所有,静态资源 *.css,*.js 不用考虑。。
                //springboot已经做好静态资源映射。
//              registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
////                      .excludePathPatterns("/index.html","/","/user/login");
            }
        };
        return adapter;
    }

    @Bean
    public LocaleResolver localeResolver(){

        return new MyLocaleResolver();
    }
}
