package com.wl.boot;

import com.wl.boot.listener.MyListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 17997
 */
@SpringBootApplication
//@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        //获取ConfigurableApplicationContext上下文
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        //装载监听
        context.addApplicationListener(new MyListener1());
    }

}
