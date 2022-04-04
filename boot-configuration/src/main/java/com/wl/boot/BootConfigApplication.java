package com.wl.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 17997
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:bean.xml","classpath:beans.xml"})
public class BootConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootConfigApplication.class,args);
    }
}
