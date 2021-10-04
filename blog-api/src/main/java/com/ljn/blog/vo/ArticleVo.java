package com.ljn.blog.vo;


import java.util.List;

public class ArticleVo {

    private Long id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private Integer weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo category;



    public ArticleVo() {
    }

    public ArticleVo(Long id, String title, String summary, Integer commentCounts, Integer viewCounts, Integer weight, String createDate, String author, ArticleBodyVo body, List<TagVo> tags, CategoryVo category) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.commentCounts = commentCounts;
        this.viewCounts = viewCounts;
        this.weight = weight;
        this.createDate = createDate;
        this.author = author;
        this.body = body;
        this.tags = tags;
        this.category = category;
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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<TagVo> getTags() {
        return tags;
    }

    public void setTags(List<TagVo> tags) {
        this.tags = tags;
    }

    public ArticleBodyVo getBody() {
        return body;
    }

    public void setBody(ArticleBodyVo body) {
        this.body = body;
    }

    public CategoryVo getCategory() {
        return category;
    }

    public void setCategory(CategoryVo category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ArticleVo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", commentCounts=" + commentCounts +
                ", viewCounts=" + viewCounts +
                ", weight=" + weight +
                ", createDate='" + createDate + '\'' +
                ", author='" + author + '\'' +
                ", tags=" + tags +
                '}';
    }

}