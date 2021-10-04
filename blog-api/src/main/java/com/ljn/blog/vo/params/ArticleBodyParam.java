package com.ljn.blog.vo.params;

public class ArticleBodyParam {

    private String content;

    private String contentHtml;

    public ArticleBodyParam() {
    }

    public ArticleBodyParam(String content, String contentHtml) {
        this.content = content;
        this.contentHtml = contentHtml;
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
}