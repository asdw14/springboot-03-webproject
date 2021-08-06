package com.dizhongdi.service;

import com.dizhongdi.pojo.User;

import java.util.List;

/**
 * ClassName:IUserService
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/1 19:02
 * @Author:dizhongdi
 */
public interface IUserService {
    //注册
    int addUser(User user);
    //验证用户
    int queryUser(User user);
}
