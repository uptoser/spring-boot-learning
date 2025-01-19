package com.uptoser.springboot.learning.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uptoser.springboot.learning.mybatis.entities.Role;
import com.uptoser.springboot.learning.mybatis.entities.UserRole;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Terry Roy
 * @since 2025-01-07
 */
public interface IUserRoleService extends IService<UserRole> {
    Role test();
}
