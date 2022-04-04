package com.wl.boot.orm.controller;

import com.wl.boot.orm.common.AjaxResponse;
import com.wl.boot.orm.entity.Article;
import com.wl.boot.orm.service.impl.ArticleJpaServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 17997
 */
@RestController
@RequestMapping(value = "/api/v1/articles")
public class ArticleController {

    @Resource
    private ArticleJpaServiceImpl articleJpaService;

    @GetMapping(value = "/all")
    public AjaxResponse selectAll() {
        return AjaxResponse.success(articleJpaService.selectAll());
    }

    @PostMapping()
    public AjaxResponse addArticle(@RequestBody Article article) {
        return AjaxResponse.success(articleJpaService.saveArticle(article));
    }

    @PutMapping()
    public AjaxResponse updateArticle(@RequestBody Article article) {
        if (articleJpaService.saveArticle(article) != null) {
            return AjaxResponse.success("修改成功");
        } else {
            return AjaxResponse.failure();
        }
    }

    @GetMapping("{id}")
    public AjaxResponse findById(@PathVariable int id) {
        return AjaxResponse.success(articleJpaService.findById(id));
    }
}
