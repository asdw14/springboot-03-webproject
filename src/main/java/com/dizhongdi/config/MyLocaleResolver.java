package com.dizhongdi.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * ClassName:MyLocaleResolver
 * Package:com.dizhongdi.config
 * Description:
 *
 * @Date: 2021/7/29 21:40
 * @Author:dizhongdi
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取语言参数
        String language = request.getParameter("l");
        //如果为空返回默认的
        if (!StringUtils.isEmpty(language)){
            String[] split = language.split("_");
            return new Locale(split[0],split[1]);
        }
        return Locale.getDefault();
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
