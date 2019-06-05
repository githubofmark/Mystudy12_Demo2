package com.controller;

import com.service.UserService;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired
    UserService userService;
    @RequestMapping("/")
    public String Index(Model model, @RequestParam(value = "name",required =false )String name){
         model.addAttribute("e",userService.getUserOrByName(name));
        System.out.println("======================="+name);
         return "index";
    }
}
