package com.dizhongdi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:Email
 * Package:com.dizhongdi.pojo
 * Description:
 *
 * @Date: 2021/8/6 20:14
 * @Author:dizhongdi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    private String emailaddress;
    private int codetime;
    private String randomcode;

    public Email(String emailaddress, int codetime, String randomcode) {
        this.emailaddress = emailaddress;
        this.codetime = codetime;
        this.randomcode = randomcode;
        this.status = 0;
    }

    private int status;     //0为未注册 1为已注册


}
