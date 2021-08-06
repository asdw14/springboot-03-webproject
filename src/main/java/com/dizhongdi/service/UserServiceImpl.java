package com.dizhongdi.service;

import com.dizhongdi.mapper.UserMapper;
import com.dizhongdi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:UserServiceImpl
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/1 19:03
 * @Author:dizhongdi
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int queryUser(User user) {
        return userMapper.queryUser(user);
    }
}
