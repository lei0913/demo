package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ssbfenqi
 * Date:2021/11/6
 * Timme:16:27
 * author: libanglei
 */
@Controller
public class Indexcontroller {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping({"index","/"})
    public String index() {
        return "index";
    }
/*
    @RequestMapping("/addUser")
    public String addUser() {
        userMapper.addUser(new User(null, "李帮磊", 30));
        return "ok";
    }
    @RequestMapping("/queryUserList")
    public List<User> queryUserList(){
        return userMapper.queryUserList();
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id){
        userMapper.deleteUser(id);
        return "ok";
    }*/


}
