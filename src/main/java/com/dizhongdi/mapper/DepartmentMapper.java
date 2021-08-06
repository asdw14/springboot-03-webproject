package com.dizhongdi.mapper;

import com.dizhongdi.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * ClassName:DepartmentMapper
 * Package:com.dizhongdi.mapper
 * Description:
 *
 * @Date: 2021/8/1 16:13
 * @Author:dizhongdi
 */
@Mapper
public interface DepartmentMapper {
    List<Department> getDepartments();

    //通过id得到部门
    Department getDepartmentById(Integer id);

    void setDepartment(Department department);
}
