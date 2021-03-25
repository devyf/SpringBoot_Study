package com.fengye.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //在消费者中使用dubbo订阅远程服务：使用dubbo提供的@Refence注解
    @Reference
    private TicketService ticketService;

    public void getTicket(){
        String ticket = ticketService.buyTicket();
        System.out.println("从注册中心拿到：" + ticket);
    }
}
