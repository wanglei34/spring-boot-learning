package com.wl.boot.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @author 17997
 */
@Data
public class Book {
    private String name;
    @Min(value = 2, message = "价格不能小于2元")
    private Integer price;
    @Past
    private Date createTime;

}
