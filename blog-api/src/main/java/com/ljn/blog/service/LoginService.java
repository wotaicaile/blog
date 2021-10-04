package com.ljn.blog.service;

import com.ljn.blog.dao.pojo.SysUser;
import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.params.LoginParam;

public interface LoginService {
    Result login(LoginParam loginParam);

    Result logout(String token);

    SysUser checkToken(String token);
}
