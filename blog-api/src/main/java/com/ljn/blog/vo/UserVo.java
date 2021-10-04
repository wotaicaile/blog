package com.ljn.blog.vo;

public class UserVo {

    private String nickname;

    private String avatar;

    private Long id;

    public UserVo() {
    }

    public UserVo(String nickname, String avatar, Long id) {
        this.nickname = nickname;
        this.avatar = avatar;
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
}