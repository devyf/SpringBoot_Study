package com.fengye.service.impl;

import com.fengye.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component  //使用dubbo后尽量不要使用Service注解
@Service  //标识可以被dubbo扫描到，项目启动后就注册到注册中心
public class TicketServiceImpl implements TicketService {
    @Override
    public String buyTicket() {
        return "成功购票一张";
    }
}
