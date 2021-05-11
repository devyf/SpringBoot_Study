package com.fengye.springboot_mybatis.service;

import com.fengye.springboot_mybatis.entity.User;

import java.util.List;

/**
 * @Description:
 * @Author: huang
 * @Date: 2021/5/12 0:01
 */
public interface UserService {
    List<User> findAllUsers();

    void insert(User user);

    void update(User user);

    void deleteById(Integer id);
}
