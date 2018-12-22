package com.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
 
    /**
     * 注册拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//addPathPattern后跟拦截地址，excludePathPatterns后跟排除拦截地址
registry.addInterceptor(new MyInterceptor()).
addPathPatterns("/**List.htm").
addPathPatterns("/**add_edit.html").
addPathPatterns("/**admin.htm").
excludePathPatterns("/logout").
excludePathPatterns("/index").
excludePathPatterns("/login.htm");
    }
}
