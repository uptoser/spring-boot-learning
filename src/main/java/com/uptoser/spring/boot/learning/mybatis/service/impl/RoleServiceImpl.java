package com.uptoser.spring.boot.learning.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uptoser.spring.boot.learning.mybatis.entities.Role;
import com.uptoser.spring.boot.learning.mybatis.mapper.RoleMapper;
import com.uptoser.spring.boot.learning.mybatis.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Terry Roy
 * @since 2025-01-07
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
