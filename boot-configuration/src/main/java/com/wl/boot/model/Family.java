package com.wl.boot.model;

import com.wl.boot.util.MixPropertySourceFactory;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author 17997
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")
@PropertySource(value = {"classpath:family.properties"},factory = MixPropertySourceFactory.class)

public class Family {

    @Length(min = 5,max = 20,message = "家庭名称长度必须在5-20位之间")
//    @Value("${family.family-name}")
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}
