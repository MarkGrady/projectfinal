package com.qf.projectfinal.service;


import com.qf.projectfinal.po.User;
import com.qf.projectfinal.vo.MsgResult;

public interface MemberService {
//    register
    public MsgResult register(User user);
//    login
    public MsgResult login(String userName, String userPassword);

}
