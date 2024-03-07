package com.example.bookstore.controller;


import com.example.bookstore.entity.muziuser;
import com.example.bookstore.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService userService;

    @RequestMapping("/showUser")
    public String showUser(){
        muziuser muziUser = new muziuser();
        muziUser.setId(6);
        muziUser.setAge(5);
        muziUser.setName("5");
        muziUser.setSex(5);
        userService.insertUser(muziUser);
        return null;
    }

}
