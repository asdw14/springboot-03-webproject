package com.dizhongdi.service;

import com.dizhongdi.mapper.DepartmentMapper;
import com.dizhongdi.mapper.EmployeeMapper;
import com.dizhongdi.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * ClassName:EmployeeServiceImpl
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/1 16:24
 * @Author:dizhongdi
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public void add(Employee employee) {
        employeeMapper.add(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeMapper.deleteById(id);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = employeeMapper.getEmployeeById(id);
        employee.setDepartmentName(departmentMapper.getDepartmentById(employeeMapper.getEmployeeById(id).getDepartmentId()).getDepartmentName());
        return employee;
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }
}
