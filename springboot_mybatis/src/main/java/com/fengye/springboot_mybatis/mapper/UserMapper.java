package com.fengye.springboot_mybatis.mapper;

import com.fengye.springboot_mybatis.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper  //这个注解表示了这个类是一个mybatis的mapper接口类
@Repository
public interface UserMapper {
    List<User> findAllUsers();

    void insert(User user);

    void update(User user);

    void deleteById(Integer id);
}
