package com.wl.boot.datasource.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 17997
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BootUser {
    private Integer id;
    private String name;
    private String detail;
}
