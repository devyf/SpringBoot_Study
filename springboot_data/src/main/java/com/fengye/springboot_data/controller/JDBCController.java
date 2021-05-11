package com.fengye.springboot_data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/queryList")
    public List<Map<String, Object>> query() {
        String sql = "select * from user";
        List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql);
        return queryForList;
    }

    @RequestMapping("/addUser")
    public String AddUser(){
        String sql = "insert into mybatis02_0322.user(id, username, password) values(5, '李浪', '654321')";
        int update = jdbcTemplate.update(sql);
        return "AddUser Ok";
    }

    @RequestMapping("/update/{id}")
    public String update(@PathVariable("id") Integer id){
        String sql = "update mybatis02_0322.user set username = ?, password = ? where id = " + id;
        Object[] objects = new Object[2];
        objects[0] = "测试哈哈哈111";
        objects[1] = "32321";
        int update = jdbcTemplate.update(sql, objects);
        return "updateUser Ok";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        String sql = "delete from mybatis02_0322.user where id = " + id;
        int update = jdbcTemplate.update(sql);
        return "delete Ok";
    }
}
