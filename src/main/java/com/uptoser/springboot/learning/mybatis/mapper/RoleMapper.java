package com.uptoser.springboot.learning.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uptoser.springboot.learning.mybatis.entities.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Terry Roy
 * @since 2025-01-07
 */
public interface RoleMapper extends BaseMapper<Role> {
    @Select("SELECT r.* FROM t_role r \n" +
            "LEFT JOIN t_user_role ur on ur.role_id = r.id\n" +
            "WHERE ur.user_id = #{id}")
    List<Role> getRolesByUserId(String id);

}
