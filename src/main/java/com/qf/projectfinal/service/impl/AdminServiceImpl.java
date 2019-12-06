package com.qf.projectfinal.service.impl;


import com.qf.projectfinal.mapper.UserMapper;
import com.qf.projectfinal.po.User;
import com.qf.projectfinal.po.UserExample;
import com.qf.projectfinal.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<User> findAllUser() {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        List<User> userList = userMapper.selectByExample(userExample);
        log.info("userinfo", userList);
        return userList;
    }

    /**
     * 通过主键查询
     *
     * @param userId
     * @return
     */
    @Override
    public User findUserByUserId(Integer userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }

    /**
     * 增加数据
     *
     * @param user
     * @return
     */
    @Override
    public boolean addUser(User user) {
        int i = userMapper.insert(user);
        if (i > 0) {
            return true;
        }
        return false;
    }

    /**
     * 通过对象更新
     *
     * @param user
     * @return
     */
    @Override
    public boolean updateUserByUser(User user) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(user.getUserId());
        User user1 = new User();

        user1.setUserName(user.getUserName());
        user1.setUserPassword(user.getUserPassword());
        user1.setUserAccount(user.getUserAccount());
        user1.setUserAdress(user.getUserAdress());
        user1.setUserTel(user.getUserTel());
        user1.setUserImg(user.getUserImg());
        user1.setUserEmail(user.getUserEmail());
        int i = userMapper.updateByExampleSelective(user1, userExample);
        if (i > 0) {
            return true;
        }
        return false;
    }

    /**
     * 根据主键删除
     * @param userId
     * @return
     */
    @Override
    public boolean deleteUserByUserId(Integer userId) {
        int i = userMapper.deleteByPrimaryKey(userId);
        if (i > 0) {
            return true;
        }
        return false;
    }
}
