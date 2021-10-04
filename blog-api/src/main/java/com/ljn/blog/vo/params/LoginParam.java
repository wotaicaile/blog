package com.ljn.blog.vo.params;

public class LoginParam {
    private  String account;
    private String password;

    public LoginParam() {
    }

    public LoginParam(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
