package com.ljn.blog.service;

import com.ljn.blog.dao.pojo.SysUser;
import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.UserVo;

public interface SysUserService {

    SysUser findUserById(Long userId);

    SysUser findUser(String account, String password);

    void save(SysUser sysUser);

    SysUser findUserByAccount(String account);

    Result findUserInfoByToken(String token);

    UserVo findUserVoById(Long Id);
}