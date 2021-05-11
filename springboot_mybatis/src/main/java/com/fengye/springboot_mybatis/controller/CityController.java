package com.fengye.springboot_mybatis.controller;

import com.fengye.springboot_mybatis.entity.City;
import com.fengye.springboot_mybatis.entity.User;
import com.fengye.springboot_mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author: huang
 * @Date: 2021/5/12 0:52
 */
@RestController
@RequestMapping("/city/api")
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/findCityById/{id}")
    public City findCityById(@PathVariable("id") Long id){
        return cityService.findCityById(id);
    }

    @PostMapping("/insert")
    public String insert(City city){
        cityService.insert(city);
        return "insert ok";
    }

    @PostMapping("/update")
    public String update(City city){
        cityService.update(city);
        return "update ok";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        cityService.deleteById(id);
        return "delete ok";
    }
}
