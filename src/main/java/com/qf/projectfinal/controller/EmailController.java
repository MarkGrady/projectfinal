package com.qf.projectfinal.controller;
import com.qf.projectfinal.service.impl.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.qf.projectfinal.utils.VerCodeGenerateUtil.generateVerCode;


@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @RequestMapping("/email")
    public Object sendEmail(@RequestParam("emailAddress") String emailAddress) {
        try {
            emailService.sendEmailVerCode(emailAddress,generateVerCode());
            return "邮件发送成功";
        } catch (Exception e) {
            return "邮件发送失败";
        }
    }
}
