package com.dizhongdi.dao;

import com.dizhongdi.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:DepartmentDao
 * Package:com.dizhongdi.dao
 * Description:
 *
 * @Date: 2021/7/29 15:24
 * @Author:dizhongdi
 */
@Repository
public class DepartmentDao {
    public static Map<Integer, Department> departmens = null;
    static {
        departmens = new HashMap<Integer,Department>();
        departmens.put(101,new Department(101,"教学部"));
        departmens.put(102,new Department(102,"市场部"));
        departmens.put(103,new Department(103,"教研部"));
        departmens.put(104,new Department(104,"运营部"));
        departmens.put(105,new Department(105,"后勤部"));
    }

    //获取所有部门信息
    public Collection<Department> getDepartments(){
        return departmens.values();
    }

    //通过id得到部门
    public Department getDepartmentById(Integer id){
        return departmens.get(id);
    }
}
