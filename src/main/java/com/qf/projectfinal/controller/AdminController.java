package com.qf.projectfinal.controller;


import com.qf.projectfinal.po.User;
import com.qf.projectfinal.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping(value = "/findUserInfo",method = RequestMethod.GET)
    public List<User> findUserInfoFun(){
        List<User> allUser = adminService.findAllUser();
        return allUser;
    }

    /**
     * 通过主键查询对象
     * @param userId
     * @return
     */
    @RequestMapping(value = "/findUserByUserId",method = RequestMethod.POST)
    public User findUserByUserIdFun(Integer userId){
        User userByUserId = adminService.findUserByUserId(userId);
        return userByUserId;
    }

    /**
     * 通过对对象更新
     * @param user
     * @return
     */
    @RequestMapping(value = "/updateUserByUser",method = RequestMethod.POST)
    public String updateUserByUserFun(User user){
        boolean b = adminService.updateUserByUser(user);
        if(b){
            return "更新成功";
        }
        return "更新失败";
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public User addUserFun(User user){
        boolean b = adminService.addUser(user);
        if(b){
            return user;
        }
        return null;
    }

    /**
     * 通过主键删除
     * @param userId
     * @return
     */
    @RequestMapping(value = "/deleteUserByUserId",method = RequestMethod.POST)
    public String deleteUserByUserIdFun(Integer userId){
        boolean b = adminService.deleteUserByUserId(userId);
        if(b){
            return "删除成功";
        }
        return "删除失败";
    }
}
