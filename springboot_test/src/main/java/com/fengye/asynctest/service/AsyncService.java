package com.fengye.asynctest.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async
    public void execute(){
        try {
            Thread.sleep(3000);  //执行系统耗时任务
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务执行成功!");
    }
}
