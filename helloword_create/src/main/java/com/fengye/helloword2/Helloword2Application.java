package com.fengye.helloword2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //标注这个类是一个springboot应用：启动类下的所有资源被导入
public class Helloword2Application {

    public static void main(String[] args) {
        SpringApplication.run(Helloword2Application.class, args);
    }

}
