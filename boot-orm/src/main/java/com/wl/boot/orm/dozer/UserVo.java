package com.wl.boot.orm.dozer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 17997
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVo {
    private Integer id;
    private String phone;
    private String avatar;
    private List<Book> books;
}
