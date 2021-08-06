package com.dizhongdi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:User
 * Package:com.dizhongdi.pojo
 * Description:
 *
 * @Date: 2021/8/1 15:03
 * @Author:dizhongdi
 */
@Data
@NoArgsConstructor
public class User {
    private int id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
