package com.fengye.helloword2.controller;

import com.fengye.helloword2.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController  //相当于@Controller与@ResponseBody
public class HelloworldController {
    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello(){
        return "hello SpringBoot Starter。。。!";
    }

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
