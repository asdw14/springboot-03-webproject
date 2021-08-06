package com.dizhongdi.mapper;

import com.dizhongdi.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:EmployeeMapper
 * Package:com.dizhongdi.mapper
 * Description:
 *
 * @Date: 2021/8/1 16:12
 * @Author:dizhongdi
 */
@Mapper
public interface EmployeeMapper {
    List<Employee> getAll();
    //添加员工
    void add(Employee employee);

    //删除员工
    void deleteById(int id);
    //通过id得到员工
    Employee getEmployeeById(int id);

    void update(Employee employee);
}
