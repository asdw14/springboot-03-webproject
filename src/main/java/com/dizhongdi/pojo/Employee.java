package com.dizhongdi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * ClassName:Employee
 * Package:com.dizhongdi.pojo
 * Description:
 *
 * @Date: 2021/7/29 14:56
 * @Author:dizhongdi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String emali;
    private Integer sex; //0：女，1：男
    private Date birth;
    private int departmentId;
    private String departmentName;

    public Employee(Integer id, String lastName, String emali, Integer sex, Date birth, int departmentId) {
        this.id = id;
        this.lastName = lastName;
        this.emali = emali;
        this.sex = sex;
        this.birth = birth;
        this.departmentId = departmentId;
    }

}
