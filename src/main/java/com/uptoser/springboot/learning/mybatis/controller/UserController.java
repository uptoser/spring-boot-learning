package com.uptoser.springboot.learning.mybatis.controller;


import com.uptoser.springboot.learning.base.entity.ResponseEntity;
import com.uptoser.springboot.learning.mybatis.entities.User;
import com.uptoser.springboot.learning.mybatis.service.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Terry Roy
 * @since 2025-01-07
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ApiOperation(value = "获取用户")
    @ApiImplicitParams({ @ApiImplicitParam(paramType = "query",  name = "id", value = "id", required = true) })
    public ResponseEntity<User> user(String id) {
        return new ResponseEntity<>(200, "成功", userService.getById(id));
    }

}
