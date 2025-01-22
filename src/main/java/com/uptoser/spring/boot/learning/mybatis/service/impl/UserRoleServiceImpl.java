package com.uptoser.spring.boot.learning.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uptoser.spring.boot.learning.mybatis.entities.Role;
import com.uptoser.spring.boot.learning.mybatis.mapper.UserRoleMapper;
import com.uptoser.spring.boot.learning.mybatis.service.IUserRoleService;
import com.uptoser.spring.boot.learning.mybatis.entities.UserRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Terry Roy
 * @since 2025-01-07
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;

    public Role test(){
        return userRoleMapper.test();
    }

}
