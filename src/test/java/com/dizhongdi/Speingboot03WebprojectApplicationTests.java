package com.dizhongdi;

import com.dizhongdi.pojo.Department;
import com.dizhongdi.pojo.Employee;
import com.dizhongdi.service.IDepartmentService;
import com.dizhongdi.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Speingboot03WebprojectApplicationTests {

    @Autowired
    IEmployeeService employeeService;
    @Test
    void contextLoads() {
        employeeService.add(new Employee(1001,"1AAA","2755063993@qq.com",0,new Date(),101));
        employeeService.add(new Employee(1002,"2AAA","2755063993@qq.com",0,new Date(),102));
        employeeService.add(new Employee(1003,"3AAA","2755063993@qq.com",0,new Date(),103));
        employeeService.add(new Employee(1004,"4AAA","2755063993@qq.com",0,new Date(),104));
        employeeService.add(new Employee(1005,"5AAA","2755063993@qq.com",0,new Date(),105));
    }

}
