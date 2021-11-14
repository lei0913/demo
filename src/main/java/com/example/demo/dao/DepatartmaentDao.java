package com.example.demo.dao;

import com.example.demo.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * ssbfenqi
 * Date:2021/11/12
 * Timme:19:09
 * author: libanglei
 */
@Repository
public class DepatartmaentDao {
    //模拟数据库的数据
    private static Map<Integer, Department> departmentMap = null;
    static{
        departmentMap = new HashMap<Integer, Department>();
        departmentMap.put(101, new Department(101, "教学部"));
        departmentMap.put(102, new Department(102, "市场部"));
        departmentMap.put(103, new Department(103, "运营部"));
        departmentMap.put(104, new Department(104, "销售部"));
        departmentMap.put(105, new Department(105, "后勤部"));
    }
    //获得所有部门信息

    private Collection<Department> getDepartments() {
        return departmentMap.values();
    }
    //通过id得到部门
    Department getDepartmentById(Integer id) {
        return departmentMap.get(id);
    }
}
