package com.ljn.blog.admin.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Permission {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private String path;

    private String description;

    public Permission() {
    }

    public Permission(Long id, String name, String path, String description) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
