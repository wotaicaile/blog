package com.ljn.blog.vo.params;

import com.ljn.blog.vo.CategoryVo;
import com.ljn.blog.vo.TagVo;

import java.util.List;

public class ArticleParam {

    private Long id;

    private ArticleBodyParam body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;

    public ArticleParam() {
    }

    public ArticleParam(Long id, ArticleBodyParam body, CategoryVo category, String summary, List<TagVo> tags, String title) {
        this.id = id;
        this.body = body;
        this.category = category;
        this.summary = summary;
        this.tags = tags;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArticleBodyParam getBody() {
        return body;
    }

    public void setBody(ArticleBodyParam body) {
        this.body = body;
    }

    public CategoryVo getCategory() {
        return category;
    }

    public void setCategory(CategoryVo category) {
        this.category = category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<TagVo> getTags() {
        return tags;
    }

    public void setTags(List<TagVo> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}