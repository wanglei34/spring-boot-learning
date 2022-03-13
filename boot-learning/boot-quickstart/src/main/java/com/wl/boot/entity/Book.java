package com.wl.boot.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class Book {
    private Integer id;
    private String name;
    //private static Logger logger = LoggerFactory.getLogger(Book.class);

    public void test(){
        //logger.info("info");
    }
}
