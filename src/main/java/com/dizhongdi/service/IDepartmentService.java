package com.dizhongdi.service;

import com.dizhongdi.pojo.Department;

import java.util.Collection;
import java.util.List;

/**
 * ClassName:IDepartmentService
 * Package:com.dizhongdi.service
 * Description:
 *
 * @Date: 2021/8/1 16:24
 * @Author:dizhongdi
 */
public interface IDepartmentService {
    List<Department> getDepartments();

    //通过id得到部门
    Department getDepartmentById(int id);

    void setDepartment(Department department);
}
