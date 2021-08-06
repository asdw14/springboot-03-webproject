package com.dizhongdi.service;

import com.dizhongdi.mapper.DepartmentMapper;
import com.dizhongdi.mapper.EmployeeMapper;
import com.dizhongdi.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * ClassName:DepartmentServiceImpl
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/1 16:24
 * @Author:dizhongdi
 */
@Service
public class DepartmentServiceImpl implements IDepartmentService{
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public List<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }

    @Override
    public Department getDepartmentById(int id) {
        return departmentMapper.getDepartmentById(id);
    }

    @Override
    public void setDepartment(Department department) {
        departmentMapper.setDepartment(department);
    }
}
