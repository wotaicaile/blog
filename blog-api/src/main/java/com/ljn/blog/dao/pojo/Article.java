package com.ljn.blog.dao.pojo;


public class Article {

        public static final int Article_TOP = 1;

        public static final int Article_Common = 0;

        private Long id;

        private String title;

        private String summary;

        private Integer commentCounts;

        private Integer viewCounts;

        /**
         * 作者id
         */
        private Long authorId;
        /**
         * 内容id
         */
        private Long bodyId;
        /**
         *类别id
         */
        private Long categoryId;

        /**
         * 置顶
         */
        private Integer weight;


        /**
         * 创建时间
         */
        private Long createDate;


    public Article() {
    }

    public Article(Long id, String title, String summary, Integer commentCounts, Integer viewCounts, Long authorId, Long bodyId, Long categoryId, Integer weight, Long createDate) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.commentCounts = commentCounts;
        this.viewCounts = viewCounts;
        this.authorId = authorId;
        this.bodyId = bodyId;
        this.categoryId = categoryId;
        this.weight = weight;
        this.createDate = createDate;
    }

    public static int getArticle_TOP() {
        return Article_TOP;
    }

    public static int getArticle_Common() {
        return Article_Common;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getCommentCounts() {
        return commentCounts;
    }

    public void setCommentCounts(Integer commentCounts) {
        this.commentCounts = commentCounts;
    }

    public Integer getViewCounts() {
        return viewCounts;
    }

    public void setViewCounts(Integer viewCounts) {
        this.viewCounts = viewCounts;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getBodyId() {
        return bodyId;
    }

    public void setBodyId(Long bodyId) {
        this.bodyId = bodyId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }
}



