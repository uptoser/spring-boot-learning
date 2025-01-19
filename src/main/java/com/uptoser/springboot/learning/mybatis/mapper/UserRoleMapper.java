package com.uptoser.springboot.learning.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uptoser.springboot.learning.mybatis.entities.Role;
import com.uptoser.springboot.learning.mybatis.entities.UserRole;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Terry Roy
 * @since 2025-01-07
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {
    @Select("SELECT r.* FROM t_role r WHERE r.id = '1'")
    Role test();
}
