package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ssbfenqi
 * Date:2021/11/13
 * Timme:16:07
 * author: libanglei
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private Integer id;
    private String name;
    private String email;
    private String message;
    private String phone;

}
