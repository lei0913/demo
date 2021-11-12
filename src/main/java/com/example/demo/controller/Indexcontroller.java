package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ssbfenqi
 * Date:2021/11/6
 * Timme:16:27
 * author: libanglei
 */
@Controller
public class Indexcontroller {
    @RequestMapping("/index")
    public String test1(Model model) {
        model.addAttribute("msg", "hello,springboot");

        return "index";
    }


}
