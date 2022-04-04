package com.wl.boot.orm.mybatis.mapper;


import com.wl.boot.orm.mybatis.domain.Teacher;

/**
 * @author 17997
 */
public interface TeacherMapper {
    /**
     * 根据教师id查询对应班级
     * @param teacherId
     * @return
     */
    Teacher findOneByOne(int teacherId);

}