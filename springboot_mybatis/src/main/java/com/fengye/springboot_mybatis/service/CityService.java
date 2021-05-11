package com.fengye.springboot_mybatis.service;

import com.fengye.springboot_mybatis.entity.City;
import com.fengye.springboot_mybatis.entity.User;

import java.util.List;

/**
 * @Description:
 * @Author: huang
 * @Date: 2021/5/12 0:49
 */
public interface CityService {
    City findCityById(Long id);

    void insert(City city);

    void update(City city);

    void deleteById(Long id);
}
