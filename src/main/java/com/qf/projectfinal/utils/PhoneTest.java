package com.qf.projectfinal.utils;

import com.zhenzi.sms.ZhenziSmsClient;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class PhoneTest {
    public static String phoneSend() {
        String apiUrl = "http://sms_developer.zhenzikj.com";


        //*****
        String appId = "\n" + "103662";

        //*****
        String appSecret = "c50bbcfe-b8e5-4e64-b489-8931710958c2\n";

        try {
            //随机生成验证码
            String smsCode = String.valueOf(new Random().nextInt(999999));

            //将验证码通过榛子云接口 发送到手机
            ZhenziSmsClient client = new ZhenziSmsClient(apiUrl, appId, appSecret);
            //发往的手机号
            String tel = "8392154617";
            //发送的信息内容
            String result = client.send(tel, "您的验证码为", smsCode + "你正在注册新用户感谢您的支持" + "验证码在五分之内有效");
            //打印日志输出
            log.info("短信发送的结果：" + result);
            return smsCode;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
