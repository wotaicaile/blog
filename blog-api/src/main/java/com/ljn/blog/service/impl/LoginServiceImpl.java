package com.ljn.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.ljn.blog.dao.pojo.SysUser;
import com.ljn.blog.service.LoginService;
import com.ljn.blog.service.SysUserService;
import com.ljn.blog.utils.CommonThings;
import com.ljn.blog.utils.JWTUtils;
import com.ljn.blog.vo.ErrorCode;
import com.ljn.blog.vo.Result;
import com.ljn.blog.vo.params.LoginParam;
import com.mysql.cj.util.StringUtils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public Result login(LoginParam loginParam) {
        String account = loginParam.getAccount();
        String password = loginParam.getPassword();
        if (StringUtils.isNullOrEmpty(account) || StringUtils.isNullOrEmpty(password)){
            return Result.fail(ErrorCode.PARAMS_ERROR.getCode(),ErrorCode.PARAMS_ERROR.getMsg());
        }
        password = DigestUtils.md5Hex(password + CommonThings.salt);
        SysUser sysUser = sysUserService.findUser(account,password);
        if (sysUser == null){
            return Result.fail(ErrorCode.ACCOUNT_PWD_NOT_EXIST.getCode(),ErrorCode.ACCOUNT_PWD_NOT_EXIST.getMsg());
        }
//        生成tocken
        String token = JWTUtils.createToken(sysUser.getId());
//        向redis中加入token
        redisTemplate.opsForValue().set("TOKEN_"+token, JSON.toJSONString(sysUser),1, TimeUnit.DAYS);

//        返回token给前端，前端获取token就显示登录
        return Result.success(token);
    }

    /**
     * 删除redis中的token，返回null即为注销登录
     * @param token
     * @return
     */
    @Override
    public Result logout(String token) {
        redisTemplate.delete("TOKEN_"+token);
        System.out.println("删除了token");
        return Result.success(null);
    }

    @Override
    public SysUser checkToken(String token) {
        if (com.baomidou.mybatisplus.core.toolkit.StringUtils.isBlank(token)){
            System.out.println("token为空");
            return null;
        }
        Map<String, Object> stringObjectMap = JWTUtils.checkToken(token);
        if (stringObjectMap == null){
            System.out.println("stringObjectMap为空");
            return null;
        }

        String userJson = redisTemplate.opsForValue().get("TOKEN_" + token);
        if (com.baomidou.mybatisplus.core.toolkit.StringUtils.isBlank(userJson)){
            System.out.println("redisTemplate为空");
            return null;
        }
        SysUser sysUser = JSON.parseObject(userJson,SysUser.class);
        System.out.println(sysUser);
        return sysUser;
    }
}
