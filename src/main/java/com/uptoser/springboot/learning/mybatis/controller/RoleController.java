package com.uptoser.springboot.learning.mybatis.controller;


import com.uptoser.springboot.learning.base.entity.ResponseEntity;
import com.uptoser.springboot.learning.mybatis.entities.Role;
import com.uptoser.springboot.learning.mybatis.service.IRoleService;
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
    public ResponseEntity<List<Role>> insertingProducts() {
        return new ResponseEntity<>(200, "成功", roleService.list());
    }

}
