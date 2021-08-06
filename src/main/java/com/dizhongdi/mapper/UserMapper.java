package com.dizhongdi.mapper;

import com.dizhongdi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ClassName:UserMapper
 * Package:com.dizhongdi.mapper
 * Description:
 *
 * @Date: 2021/8/1 15:15
 * @Author:dizhongdi
 */
@Mapper
public interface UserMapper {

    int addUser(User user);
    int queryUser(User user);
}
