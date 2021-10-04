package com.ljn.blog.dao.pojo;


public class Category {


    private Long id;

    private String avatar;

    private String categoryName;

    private String description;


    public Category() {
    }

    public Category(Long id, String avatar, String categoryName, String description) {
        this.id = id;
        this.avatar = avatar;
        this.categoryName = categoryName;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

