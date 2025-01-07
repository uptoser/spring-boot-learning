package com.uptoser.springboot.learning.mybatis.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.uptoser.springboot.learning.base.entity.ResponseEntity;
import com.uptoser.springboot.learning.mybatis.entities.Role;
import com.uptoser.springboot.learning.mybatis.service.IRoleService;
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
@RequestMapping("//role")
public class RoleController {
    @Autowired
    IRoleService roleService;

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    @ApiOperation(value = "获取商品列表")
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "form",  name = "id", value = "商品id", required = true) })
    public ResponseEntity<List<Role>> insertingProducts() {
        return new ResponseEntity<>(200, "成功", roleService.list());
    }

    @RequestMapping(value = "/roles", method = RequestMethod.POST)
    @ApiOperation(value = "获取角色列表")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "form",  name = "id", value = "商品id", required = true)
    })
    public ResponseEntity<List<Role>> roles() {
        LambdaQueryWrapper<Role> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(Role::getRoleName, "role_name_1");
        return new ResponseEntity<>(200, "成功", roleService.list(lambdaQueryWrapper));
    }

}
