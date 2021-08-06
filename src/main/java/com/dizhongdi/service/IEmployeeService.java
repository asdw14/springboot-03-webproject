package com.dizhongdi.service;

import com.dizhongdi.pojo.Employee;

import java.util.List;

/**
 * ClassName:IEmployeeService
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/1 16:25
 * @Author:dizhongdi
 */
public interface IEmployeeService {
    List<Employee> getAll();
    //添加员工
    void add(Employee employee);

    //删除员工
    void deleteById(int id);
    //通过id得到员工
    Employee getEmployeeById(int id);

    void update(Employee employee);
}
