package com.wl.boot.listener;

import com.wl.boot.event.MyEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;


@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CustomListenerTest {
    @Resource
    private ApplicationContext context;

    @Test
    void testEvent() {
        context.publishEvent(new MyEvent("测试事件"));
    }
}