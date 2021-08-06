package com.dizhongdi.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName:LoginHandleInteceptor
 * Package:com.dizhongdi.config
 * Description:
 *
 * @Date: 2021/7/29 22:17
 * @Author:dizhongdi
 */
public class LoginHandleInteceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object userLogin = request.getSession().getAttribute("UserLogin");
        if (userLogin==null){
            request.setAttribute("msg","权限不足，请先登录");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }
        return true;
    }
}
