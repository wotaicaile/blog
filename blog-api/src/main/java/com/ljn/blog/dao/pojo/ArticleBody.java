package com.ljn.blog.dao.pojo;


public class ArticleBody {


    private Long id;
    private String content;
    private String contentHtml;
    private Long articleId;


    public ArticleBody() {

    }

    public ArticleBody(Long id, String content, String contentHtml, Long articleId) {
        this.id = id;
        this.content = content;
        this.contentHtml = contentHtml;
        this.articleId = articleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentHtml() {
        return contentHtml;
    }

    public void setContentHtml(String contentHtml) {
        this.contentHtml = contentHtml;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
}