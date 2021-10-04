package com.ljn.blog.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ljn.blog.dao.dos.Archives;
import com.ljn.blog.dao.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ArticleMapper extends BaseMapper<Article> {

    List<Archives> listArchives();

    IPage<Article> listArticle(Page<Article> page, @Param("categoryId") Long categoryId, @Param("tagId") Long tagId, @Param("year")String year, @Param("month") String month);
}