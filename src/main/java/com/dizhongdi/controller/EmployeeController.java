package com.dizhongdi.controller;

import com.dizhongdi.dao.DepartmentDao;
import com.dizhongdi.dao.EmployeeDao;
import com.dizhongdi.pojo.Department;
import com.dizhongdi.pojo.Employee;
import com.dizhongdi.service.IDepartmentService;
import com.dizhongdi.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * ClassName:EmployeeController
 * Package:com.dizhongdi.controller
 * Description:
 *
 * @Date: 2021/7/30 18:18
 * @Author:dizhongdi
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao dao;
    @Autowired
    DepartmentDao departmentDao;
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    IDepartmentService departmentService;
    @RequestMapping("/emps")
    public String emps(Model model){
        List<Employee> all = employeeService.getAll();
        for (Employee e: all) {
            e.setDepartmentName(departmentService.getDepartmentById(e.getDepartmentId()).getDepartmentName());
        }
        model.addAttribute("emps",all);

        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAdd(Model model){
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
//        System.out.printf("employee=>"+employee);
//        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
//        dao.add(employee);
        employeeService.add(employee);
        return "redirect:/emps";
    }

    @RequestMapping("/del/{id}")
    public String delEmp(@PathVariable int id){
        employeeService.deleteById(id);
        return "redirect:/emps";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
//        Collection<Department> departments = departmentDao.getDepartments();
        List<Department> departments = departmentService.getDepartments();
        model.addAttribute("departments",departments);
//        Employee employee = dao.getEmployeeById(id);
        Employee employee = employeeService.getEmployeeById(id);
        System.out.println(employee);
        model.addAttribute("employee",employee);
        return "emp/update";
    }

    @RequestMapping("/update")
    public String update(Employee employee){
//        System.out.printf("employee=>"+employee);
//        employeeService.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        System.out.println(employee);
        employeeService.update(employee);
        return "redirect:/emps";
    }
}
