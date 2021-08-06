package com.dizhongdi.controller;

import com.dizhongdi.mapper.UserMapper;
import com.dizhongdi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:RegisterController
 * Package:com.dizhongdi.controller
 * Description:
 *
 * @Date: 2021/8/1 18:44
 * @Author:dizhongdi
 */
@Controller
public class RegisterController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/user/register")
    public String register(String username, String password, Model model){
        userMapper.addUser(new User(username,password));
        model.addAttribute("msg","注册成功");
        return "redirect:/main.html";
    }
}
