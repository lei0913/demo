package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ssbfenqi
 * Date:2021/11/12
 * Timme:19:03
 * author: libanglei
 */
//部门表
@Data
@AllArgsConstructor//有参构造
@NoArgsConstructor//无参构造
public class Department {
    private Integer id;
    private String name;

}
