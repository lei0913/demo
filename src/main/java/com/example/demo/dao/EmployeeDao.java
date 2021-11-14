package com.example.demo.dao;

import com.example.demo.pojo.Department;
import com.example.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ssbfenqi
 * Date:2021/11/12
 * Timme:19:09
 * author: libanglei
 */
@Repository
public class EmployeeDao {
    //模拟数据库的数据
    private static Map<Integer, Employee> employeeMap = null;
    @Autowired
    private DepatartmaentDao depatartmaentDao;
    static{
        employeeMap = new HashMap<Integer, Employee>();
        employeeMap.put(1001, new Employee(1001, "AA", "14651@qq.com", "15",0, new Department(101, "教学部"), new Date()));
        employeeMap.put(1002, new Employee(1002, "AA", "14651@qq.com", "15",0, new Department(102, "市场部"), new Date()));
        employeeMap.put(1003, new Employee(1003, "AA", "14651@qq.com", "15",0, new Department(103, "运营部"), new Date()));
        employeeMap.put(1004, new Employee(1004, "AA", "14651@qq.com", "15",0, new Department(104, "销售部"), new Date()));
        employeeMap.put(1005, new Employee(1005, "AA", "14651@qq.com", "15",0, new Department(105, "后勤部"), new Date()));


    }

    //增加员工
    private static Integer initid = 1006;

    private void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initid++);
        }
        employee.setDepartment(depatartmaentDao.getDepartmentById(employee.getDepartment().getId()));
        employeeMap.put(employee.getId(), employee);

    }
}
