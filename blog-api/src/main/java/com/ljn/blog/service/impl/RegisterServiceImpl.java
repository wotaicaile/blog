package com.ljn.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.ljn.blog.dao.pojo.SysUser;
import com.ljn.blog.service.RegisterService;
import com.ljn.blog.service.SysUserService;
import com.ljn.blog.utils.CommonThings;
import com.ljn.blog.utils.JWTUtils;
import com.ljn.blog.vo.ErrorCode;
import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.params.RegisterParam;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    SysUserService sysUserService;

    @Override
    public Result register(RegisterParam registerParam) {
        String account = registerParam.getAccount();
        String password = registerParam.getPassword();
        String nickname = registerParam.getNickname();
        if (account == null||password ==null ||nickname == null){
            return Result.fail(ErrorCode.ACCOUNT_EXIST.getCode(),ErrorCode.ACCOUNT_EXIST.getMsg());
        }
        SysUser sysUser = this.sysUserService.findUserByAccount(account);
        if (sysUser != null){
            return Result.fail(ErrorCode.ACCOUNT_EXIST.getCode(),ErrorCode.ACCOUNT_EXIST.getMsg());
        }
        sysUser = new SysUser();
        sysUser.setNickname(nickname);
        sysUser.setAccount(account);
        sysUser.setPassword(DigestUtils.md5Hex(password+ CommonThings.salt));
        sysUser.setCreateDate(System.currentTimeMillis());
        sysUser.setLastLogin(System.currentTimeMillis());
        sysUser.setAvatar("/static/img/logo.b3a48c0.png");
        sysUser.setAdmin(1); //1 为true
        sysUser.setDeleted(0); // 0 为false
        sysUser.setSalt("");
        sysUser.setStatus("");
        sysUser.setEmail("");
        //插入到数据库
        this.sysUserService.save(sysUser);

        //token
        String token = JWTUtils.createToken(sysUser.getId());
        //redis
        redisTemplate.opsForValue().set("TOKEN_"+token, JSON.toJSONString(sysUser),1, TimeUnit.DAYS);
        //返回token给前端，前端获取token就显示登录
        return Result.success(token);
    }
    }

