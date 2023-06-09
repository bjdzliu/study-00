package com.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private Myinterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
      InterceptorRegistration interceptorRegistration =  registry.addInterceptor(myInterceptor);
      interceptorRegistration.addPathPatterns("/hello");

    }
}
