package com.qf.projectfinal.controller;


import com.qf.projectfinal.po.User;
import com.qf.projectfinal.service.impl.MemberServiceImpl;
import com.qf.projectfinal.vo.MsgResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MemberController {
    @Autowired
    private MemberServiceImpl memberService;
    /*注册*/
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public MsgResult register(User user){
        MsgResult register = memberService.register(user);
        return register;
    }
    /*登录*/
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public MsgResult login(String userName,String userPassword){
        MsgResult login = memberService.login(userName, userPassword);
        return login;

    }
}
