package com.ljn.blog.dao.pojo;

public class ArticleTag {

    private Long id;

    private Long articleId;

    private Long tagId;

    public ArticleTag() {
    }

    public ArticleTag(Long id, Long articleId, Long tagId) {
        this.id = id;
        this.articleId = articleId;
        this.tagId = tagId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}
