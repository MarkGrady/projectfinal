package com.qf.projectfinal.service;

import com.qf.projectfinal.po.User;

import java.util.List;

public interface AdminService {

    /**
     * 查询所有的user
     * @return
     */
    List<User> findAllUser();

    /**
     * 通过用户id查询用户
     * @return
     */
    User findUserByUserId(Integer userId);

    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 通过用户id更新用户信息
     * @param user
     * @return
     */
    boolean updateUserByUser(User user);

    /**
     * 通过用户id删除用户信息
     * @param userId
     * @return
     */
    boolean deleteUserByUserId(Integer userId);



}
