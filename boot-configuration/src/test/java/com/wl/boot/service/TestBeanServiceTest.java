package com.wl.boot.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TestBeanServiceTest {
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void testLoadService() {
//        boolean flag = ioc.containsBean("testBeanService");
//        assertTrue(flag);
        TestBeanService tbs = (TestBeanService) ioc.getBean("testBeanService");
        assertEquals("SpringBoot", tbs.getName());
        System.out.println(tbs.getName());

        TestBeanService1 tbs1 = (TestBeanService1) ioc.getBean("testBeanService1");
        assertEquals("Java", tbs1.getName());
        System.out.println(tbs1.getName());

    }
}