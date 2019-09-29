package com.controller;

import com.entity.User;
import com.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author: Yuz
 * @CreateDate: 2019/9/27$ 14:50$
 */
@RestController
@RequestMapping("/user")
@Api("用户接口")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/insert")
    @ApiOperation(value = "用户添加")
    public void insert(@RequestBody User user){
        userService.insert(user);
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除")
    public void delete(Integer id){
        userService.delete(id);
    }

    @PutMapping
    @ApiOperation(value = "更新")
    public void update(@RequestBody User user){
        userService.update(user);
    }

    @GetMapping
    @ApiOperation("查询")
    public List<User> select(){
        return userService.selectByMap();
    }

    @PostMapping("/ceshi")
    @ApiOperation(value = "测试")
    public List<User> ceshi(@RequestParam(value = "id")int id){
        return userService.ceshi(id);
    }

}
