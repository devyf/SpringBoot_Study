package com.fengye.asynctest.controller;

import com.fengye.asynctest.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    private AsyncService service;

    @RequestMapping("/execute")
    public String executeTask(){
        service.execute();  //异步执行
        return "success";
    }
}
