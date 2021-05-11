package com.fengye.springboot_mybatis.mapper;

import com.fengye.springboot_mybatis.entity.City;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: huang
 * @Date: 2021/5/12 0:34
 */
//@Mapper
@Repository
public interface CityMapper {
    @Select("select * from city where id = #{id}")
    public City getCityById(Long id);

    /**
     * 使用@Options来增加除Insert语句中其它可选参数，比如插入获取id主键的值
     * @param city
     */
    @Insert("insert into city(name, state, country) values (#{name}, #{state}, #{country})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void insert(City city);

    @Update("update city set name = #{name}, state = #{state}, country = #{country} where id = #{id}")
    public void update(City city);

    @Delete("delete from city where id = #{id}")
    public void deleteById(Long id);
}
