package com.dizhongdi.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName:MyMvcConfig
 * Package:com.dizhongdi.config
 * Description:
 *
 * @Date: 2021/7/29 15:58
 * @Author:dizhongdi
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
        registry.addViewController("/dashboard.html").setViewName("dashboard");

    }
    //自定义国际化
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandleInteceptor()).
                addPathPatterns("/**").
                excludePathPatterns("/index.html","/css/**","/img/**","/js/**","/","/user/login","/user/register","/register.html","/toRegister","/sendCode","/comparisonCode");
    }
}
