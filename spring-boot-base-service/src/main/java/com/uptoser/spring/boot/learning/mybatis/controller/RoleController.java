package com.uptoser.spring.boot.learning.mybatis.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.uptoser.spring.boot.learning.base.entity.ResponseEntity;
import com.uptoser.spring.boot.learning.mybatis.entities.Role;
import com.uptoser.spring.boot.learning.mybatis.service.IRoleService;
import com.uptoser.spring.boot.learning.mybatis.service.IUserRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Terry Roy
 * @since 2025-01-07
 */
@RestController
@RequestMapping("/sys/role")
@Api(tags = "系统相关/角色管理")
public class RoleController {
    @Autowired
    IRoleService roleService;
    @Autowired
    IUserRoleService userRoleService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ApiOperation(value = "测试导入其他mapper")
    public ResponseEntity<Role> test() {
        return new ResponseEntity<>(200, "成功", userRoleService.test());
    }
    @RequestMapping(value = "/role", method = RequestMethod.GET)
    @ApiOperation(value = "获取角色")
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query",  name = "id", value = "id", required = true) })
    public ResponseEntity<Role> role(String id) {
        return new ResponseEntity<>(200, "成功", roleService.getById(id));
    }

    @RequestMapping(value = "/roles", method = RequestMethod.POST)
    @ApiOperation(value = "获取角色列表")
    public ResponseEntity<List<Role>> roles() {
        LambdaQueryWrapper<Role> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(Role::getRoleName, "role_name_1");
        return new ResponseEntity<>(200, "成功", roleService.list(lambdaQueryWrapper));
    }

}
