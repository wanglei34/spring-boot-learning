package com.wl.boot.orm.mybatis.domain;

import java.io.Serializable;
import lombok.Data;
import org.apache.ibatis.type.Alias;


/**
 * @author 17997
 */
@Data
@Alias("CourseStudent")
public class CourseStudent implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 学生id
     */
    private Integer studentId;

    private static final long serialVersionUID = 1L;
}