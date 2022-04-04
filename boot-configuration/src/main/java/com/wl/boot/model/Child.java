package com.wl.boot.model;

import lombok.Data;

import java.util.List;

/**
 * @author 17997
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}
