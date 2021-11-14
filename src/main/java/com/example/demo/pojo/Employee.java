package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ssbfenqi
 * Date:2021/11/12
 * Timme:19:06
 * author: libanglei
 */
//员工
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private String email;
    private String age;
    private Integer gender;//0女 1男
    private Department department;
    private Date birth;

}
