package com.wl.boot.orm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 17997
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.wl.boot.orm.mybatis.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
