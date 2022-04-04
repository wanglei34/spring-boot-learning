package com.wl.boot.orm.dao;

import com.wl.boot.orm.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author 17997
 */
@RepositoryRestResource(path="articles")
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    /**
     * 注意这个方法的名称，JPA会根据方法名自动生成SQL执行
     * 等同于：SELECT * FROM article WHERE author = ?
     *
     * @param author author
     * @return List<Article>
     */
    List<Article> findByAuthor(String author);

}