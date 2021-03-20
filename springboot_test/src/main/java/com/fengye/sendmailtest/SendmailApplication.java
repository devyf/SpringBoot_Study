package com.fengye.sendmailtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.fengye.sendmailtest.service")
public class SendmailApplication {
    public static void main(String[] args) {
        SpringApplication.run(SendmailApplication.class, args);
    }
}
