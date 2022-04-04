package com.wl.boot.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
@ExtendWith(SpringExtension.class)
class EmployeeTest {
    @Resource
    private Employee employee;

    @Test
    void valueBind() throws Exception{
//        log.info(String.valueOf(employee));
        Map<String,Integer> map = employee.getEmployeeAge();
        map.forEach((key,value) -> System.out.println(key + "->" +value));
    }

    @Test
    public void testList(){
        List<String> list = List.of("bbb","ccc","aaa");
        list.forEach(System.out::println);
    }
}