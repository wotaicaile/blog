package com.ljn.blog.service;

import com.ljn.blog.vo.ArticleVo;
import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.params.ArticleParam;
import com.ljn.blog.vo.params.PageParams;



public interface ArticleService {

    Result listArticle(PageParams pageParams);

    Result hotArticle(int limit);

    Result newArticles(int limit);

    Result listArchives();

    ArticleVo findArticleById(Long id);

    Result publish(ArticleParam articleParam);
}
