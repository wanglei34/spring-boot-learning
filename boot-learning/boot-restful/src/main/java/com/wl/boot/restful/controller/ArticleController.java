package com.wl.boot.restful.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wl.boot.restful.common.AjaxResponse;
import com.wl.boot.restful.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.io.Reader;
import java.io.StringReader;
import java.util.Date;
import java.util.List;


@RestController
@Slf4j
@RequestMapping("/api/v1")

public class ArticleController {

    // 查询一篇文章
    @RequestMapping(value = "/articles/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id){
        Article article = Article.builder()
                .id(id)
                .author("wl")
                .content("spring boot 从青铜到王者")
                .createTime(new Date())
                .title("spring").build();
        log.info("article:" + article);
        return AjaxResponse.success(article);
    }

    // 新增一篇文章
    @RequestMapping(value = "/articles", method = RequestMethod.POST)
    @PostMapping(value = "/articles")
    public AjaxResponse saveArticle(@RequestBody Article article){
        log.info("saveArticle:" + article);
        return AjaxResponse.success();
    }

    // 修改一篇文章
    @RequestMapping(value = "/articles", method = RequestMethod.PUT)
    @PutMapping(value = "/articles")
    public AjaxResponse updateArticle(@RequestBody Article article){
        log.info("updateArticle:" + article);
        return AjaxResponse.success();
    }

    // 删除一篇文章, 根据id
    @RequestMapping(value = "/articles", method = RequestMethod.DELETE)
    @DeleteMapping(value = "/articles")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id){
        log.info("updateArticle:" + id);
        return AjaxResponse.success();
    }
}
