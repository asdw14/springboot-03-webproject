package com.dizhongdi.controller;

import com.dizhongdi.pojo.User;
import com.dizhongdi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * ClassName:LoginController
 * Package:com.dizhongdi.controller
 * Description:
 *
 * @Date: 2021/7/29 21:53
 * @Author:dizhongdi
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    IUserService userService;
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String passwrod, Model model, HttpSession session){
        if ((userService.queryUser(new User(username,passwrod)))>0){
            session.setAttribute("UserLogin",username);
            return "redirect:/main.html";
        }
        model.addAttribute("msg","用户名或密码错误");
        return "index";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
            session.removeAttribute("UserLogin");
            return "redirect:/main.html";

    }
}
