package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @RequestMapping("/about")
    public String index(Model model) {
        //根据id查询信息
        //User user = userMapper.queryUserById(id);
        //System.out.println(user);
        //model.addAttribute("username", user.getUsername());
        return "about";
    }

    /*
        @RequestMapping("/addUser")
        public String addUser() {
            userMapper.addUser(new User(null, "李帮磊", 30));
            return "ok";
        }*/
        @RequestMapping({"/index","/"})
    public String queryUserList(Model model) {

        List<User> users = userMapper.queryUserList();
        for (int i = 0; i < users.size(); i++) {

            model.addAttribute("user", users.get(i));
        }

        return "index";
    }

  /*  @RequestMapping("/deleteUser")
    public String deleteUser(Integer id){
        userMapper.deleteUser(id);
        return "ok";
    }*/

}
