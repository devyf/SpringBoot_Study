package com.fengye.springboot_mybatis.service.impl;

import com.fengye.springboot_mybatis.entity.City;
import com.fengye.springboot_mybatis.mapper.CityMapper;
import com.fengye.springboot_mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: huang
 * @Date: 2021/5/12 0:51
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    @Override
    public City findCityById(Long id) {
        return cityMapper.getCityById(id);
    }

    @Override
    public void insert(City city) {
        cityMapper.insert(city);
    }

    @Override
    public void update(City city) {
        cityMapper.update(city);
    }

    @Override
    public void deleteById(Long id) {
        cityMapper.deleteById(id);
    }
}
