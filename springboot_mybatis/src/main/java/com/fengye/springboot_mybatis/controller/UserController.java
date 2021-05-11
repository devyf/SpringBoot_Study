package com.fengye.springboot_mybatis.controller;

import com.fengye.springboot_mybatis.entity.User;
import com.fengye.springboot_mybatis.mapper.UserMapper;
import com.fengye.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/queryList")
    public List<User> queryList(){
        List<User> users = userService.findAllUsers();
        return users;
    }

    @GetMapping("/insert")
    public String insert(){
        User user = new User();
        user.setId(5);
        user.setUsername("金百");
        user.setPassword("133242");
        userService.insert(user);
        return "insert ok";
    }

    @GetMapping("/update")
    public String update(){
        User user = new User();
        user.setId(5);
        user.setUsername("金百update");
        user.setPassword("11111");
        userService.update(user);
        return "update ok";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        userService.deleteById(id);
        return "delete ok";
    }
}
