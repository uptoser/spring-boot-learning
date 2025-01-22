package com.uptoser.spring.boot.learning.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uptoser.spring.boot.learning.mybatis.entities.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 * @author Terry Roy
 * @since 2025-01-07
 */
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT u.* FROM t_user u \n" +
            "LEFT JOIN t_user_role ur on ur.user_id = u.id\n" +
            "WHERE ur.role_id = #{id}")
    List<User> getUsersByRoleId(String id);

}
