package com.ljn.blog.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ljn.blog.admin.mapper.AdminMapper;
import com.ljn.blog.admin.mapper.PermissionMapper;
import com.ljn.blog.admin.vo.Admin;
import com.ljn.blog.admin.vo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    public Admin findAdminByUserName(String username){
        LambdaQueryWrapper<Admin> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Admin::getUsername,username).last("limit 1");
        Admin adminUser = adminMapper.selectOne(queryWrapper);
        return adminUser;
    }

    public List<Permission> findPermissionsByAdminId(Long adminId){
        return permissionMapper.findPermissionsByAdminId(adminId);
    }

}
