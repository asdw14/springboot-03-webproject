package com.dizhongdi.service;

/**
 * ClassName:RegisterCodeService
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/6 18:41
 * @Author:dizhongdi
 */
public interface RegisterCodeService {
    public String sendEmailCode(String emailAddress);
    public String getEmailCode();
}
