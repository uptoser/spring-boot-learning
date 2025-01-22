package com.uptoser.spring.boot.learning.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uptoser.spring.boot.learning.mybatis.entities.User;
import com.uptoser.spring.boot.learning.mybatis.mapper.UserMapper;
import com.uptoser.spring.boot.learning.mybatis.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author Terry Roy
 * @since 2025-01-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
