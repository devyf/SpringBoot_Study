package com.fengye.mailtest;

import com.fengye.sendmailtest.SendmailApplication;
import com.fengye.sendmailtest.service.IMailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {SendmailApplication.class})
@RunWith(SpringRunner.class)
public class MailAppTest {

    @Autowired
    private IMailService mailService;

    /**
     * 测试发送文本邮件
     */
    @Test
    public void testSendMail() {
        mailService.sendSimpleMail("hyfmailsave@163.com","主题：你好普通邮件","内容：第一封邮件");
    }

    /**
     * 测试发送Html邮件
     */
    @Test
    public void sendHtmlMail(){
        mailService.sendHtmlMail("hyfmailsave@163.com","主题：你好html邮件","<h1>内容：第一封html邮件</h1>");
    }

    @Test
    public void sendMimeContentMail(){
        mailService.sendAttachmentsMail("hyfmailsave@163.com", "主题：你好复杂带附件邮件",
                "<p style='color:red'>谢谢你的html邮件及问候~</p>", "E:\\Workspaces\\SpringBoot_Study\\springboot_test\\src\\main\\resources\\static\\1.jpg");
    }
}
