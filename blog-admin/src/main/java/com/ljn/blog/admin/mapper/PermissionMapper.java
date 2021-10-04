package com.ljn.blog.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljn.blog.admin.vo.Permission;

import java.util.List;

public interface PermissionMapper extends BaseMapper<Permission> {

    List<Permission> findPermissionsByAdminId(Long adminId);
}