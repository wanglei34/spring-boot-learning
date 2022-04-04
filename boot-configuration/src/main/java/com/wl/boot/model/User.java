package com.wl.boot.model;

import com.wl.boot.util.MixPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author 17997
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "user")
@PropertySource(value = {"classpath:user.yml"},factory = MixPropertySourceFactory.class)
public class User {
    private String name;
    private Integer age;
    @Valid
    private Book book;
}
