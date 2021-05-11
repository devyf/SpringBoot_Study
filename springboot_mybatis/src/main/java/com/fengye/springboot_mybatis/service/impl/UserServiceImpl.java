package com.fengye.springboot_mybatis.service.impl;

import com.fengye.springboot_mybatis.entity.User;
import com.fengye.springboot_mybatis.mapper.UserMapper;
import com.fengye.springboot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: huang
 * @Date: 2021/5/12 0:02
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }
}
