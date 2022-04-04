package com.wl.boot.orm.service;

import com.wl.boot.orm.entity.Article;
import com.wl.boot.orm.service.impl.ArticleJdbcServiceImpl;
import com.wl.boot.orm.service.impl.ArticleJpaServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleServiceTest {

    @Resource
    private ArticleJdbcServiceImpl articleJdbcService;

    @Resource
    private ArticleJpaServiceImpl articleJpaService;

    @Test
    public void saveArticleByJDBC() {
        Article article = Article.builder()
                .author("wl")
                .title("SpringBoot")
                .content("SpringBoot从入门到精通")
                .build();
        Article saveArticle = articleJdbcService.saveArticle(article);
        assertNotNull(saveArticle);
    }

    @Test
    public void saveArticleByJPA() {
        Article article = Article.builder()
                .author("wl")
                .title("SpringCloud")
                .content("SpringCloud从入门到精通")
//                .createTime(new Date())
//                .updateTime(new Date())
                .build();
        Article saveArticle = articleJpaService.saveArticle(article);
        assertNotNull(saveArticle);
    }
}