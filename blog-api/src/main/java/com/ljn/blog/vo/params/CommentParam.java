package com.ljn.blog.vo.params;

public class CommentParam {

    private Long articleId;

    private String content;

    private Long parent;

    private Long toUserId;

    public CommentParam() {
    }

    public CommentParam(Long articleId, String content, Long parent, Long toUserId) {
        this.articleId = articleId;
        this.content = content;
        this.parent = parent;
        this.toUserId = toUserId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }
}