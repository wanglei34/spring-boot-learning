package com.wl.boot.orm.mybatis.mapper;

import com.wl.boot.orm.mybatis.domain.Clazz;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 17997
 */
public interface ClazzMapper {

    /**
     * 根据班级id查询班级信息
     *
     * @param clazzId 班级id
     * @return 班级信息（关联查询出所有学生）
     */
    Clazz findOneByMany(int clazzId);


    /**
     * 根据班级id查询班级信息
     *
     * @param clazzId 班级id
     * @return 班级信息（关联查询出所有学生，班级老师的信息）
     */
    Clazz getClazz(int clazzId);

}