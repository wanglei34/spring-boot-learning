package com.wl.boot.orm.mybatis.mapper;

import com.wl.boot.orm.mybatis.domain.Teacher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 17997
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {

    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void findOneByOne() {
        Teacher teacher = teacherMapper.findOneByOne(1);
        System.out.println(teacher);
    }
}