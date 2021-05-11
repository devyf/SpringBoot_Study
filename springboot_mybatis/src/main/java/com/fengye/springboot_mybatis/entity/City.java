package com.fengye.springboot_mybatis.entity;

import lombok.Data;

/**
 * @Description:
 * @Author: huang
 * @Date: 2021/5/12 0:33
 */
@Data
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
}
