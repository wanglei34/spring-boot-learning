package com.wl.boot.filter;

import com.wl.boot.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author 17997
 */
//@Configuration
@Slf4j
public class FilterRegistration {


    @Bean
    public FilterRegistrationBean filterRegistrationBean1() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new CustomFilter());
        //过滤器名称
        registration.setName("customFilter");
        //拦截路径
        registration.addUrlPatterns("/*");
        //设置顺序，数字越小优先级越高
        registration.setOrder(10);
        return registration;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean2() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.setName("myFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(5);
        return registration;
    }

}
