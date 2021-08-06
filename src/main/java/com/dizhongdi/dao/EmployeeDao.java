package com.dizhongdi.dao;

import com.dizhongdi.pojo.Department;
import com.dizhongdi.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:EmployeeDao
 * Package:com.dizhongdi.dao
 * Description:
 *
 * @Date: 2021/7/29 15:34
 * @Author:dizhongdi
 */
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao department;
//    static {
//        employees = new HashMap<Integer,Employee>();
//        employees.put(1001,new Employee(1001,"1AAA","2755063993@qq.com",1,new Department(101,"教学部")));
//        employees.put(1002,new Employee(1002,"2AAA","2755063993@qq.com",0,new Department(102,"市场部")));
//        employees.put(1003,new Employee(1003,"3AAA","2755063993@qq.com",1,new Department(103,"教研部")));
//        employees.put(1004,new Employee(1004,"4AAA","2755063993@qq.com",0,new Department(104,"运营部")));
//        employees.put(1005,new Employee(1005,"5AAA","2755063993@qq.com",1,new Department(105,"后勤部")));
//    }
    private static Integer initid = 1006;
    //获取所有员工信息
    public Collection<Employee> getAll(){
        return employees.values();
    }
    //添加员工
    public void add(Employee employee){
        if (employee.getId()==null){
            employee.setId(initid++);
        }
        employees.put(employee.getId(),employee);
    }

    //删除员工
    public void deleteById(Integer id){
        employees.remove(id);
    }
    //通过id得到员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    public void update(Employee employee) {
        employees.put(employee.getId(),employee);
    }
}
