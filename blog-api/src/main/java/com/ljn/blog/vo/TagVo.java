package com.ljn.blog.vo;

public class TagVo {
    private Long id;
    private String tagName;
    private String avatar;

    public TagVo() {
    }

    public TagVo(Long id, String tagName, String avatar) {
        this.id = id;
        this.tagName = tagName;
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
