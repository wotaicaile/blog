package com.ljn.blog.controller;

import com.ljn.blog.common.aop.Cache;
import com.ljn.blog.common.aop.LogAnnotation;
import com.ljn.blog.service.ArticleService;
import com.ljn.blog.vo.ArticleVo;
import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.params.ArticleParam;
import com.ljn.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;
//    Result是统一结果返回
    @PostMapping
    @LogAnnotation(module = "文章",operator = "获取文章列表")
    @Cache(expire = 5 * 60 * 1000,name = "articles")
    public Result articles(@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }

    @PostMapping("hot")
    @Cache(expire = 5 * 60 * 1000,name = "hot_article")
    public Result hotArticle() {
        int limit = 5;
        return articleService.hotArticle(limit);
    }
    @PostMapping("new")
    @Cache(expire = 5 * 60 * 1000,name = "new_article")
    public Result newArticles() {
        int limit = 5;
        return articleService.newArticles(limit);
    }

    @PostMapping("listArchives")
    @Cache(expire = 5 * 60 * 1000,name = "listArchives")
    public Result listArchives() {
        return articleService.listArchives();
    }

    @PostMapping("view/{id}")
    @Cache(expire = 5 * 60 * 1000,name = "viewId")
    public Result findArticleById(@PathVariable("id") Long id) {

        ArticleVo articleVo = articleService.findArticleById(id);

        return Result.success(articleVo);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return articleService.publish(articleParam);
    }


}

