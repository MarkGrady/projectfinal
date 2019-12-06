package com.qf.projectfinal.service.impl;


import com.qf.projectfinal.mapper.UserMapper;
import com.qf.projectfinal.po.User;
import com.qf.projectfinal.service.MemberService;
import com.qf.projectfinal.vo.MsgResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private UserMapper userMapper;

    /*rgister*/
    @Override
    public MsgResult register(User user) {
        User register = userMapper.register(user);
        MsgResult msgResult=new MsgResult();
        msgResult.setData(register);
        msgResult.setStatusCode(200);
        return msgResult;
    }
    /*login*/
    @Override
    public MsgResult login(String userName, String userPassword) {

        User login = userMapper.login(userName, userPassword);
        MsgResult msgResult=new MsgResult();

            msgResult.setData(login);
            msgResult.setStatusCode(200);
            return msgResult;

    }
}
