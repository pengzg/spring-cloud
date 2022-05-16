package com.demo.zuul.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController{


    @RequestMapping("/get")
    public void get(String id) throws Exception {
        System.out.println("thhis is user/get");
    }
}
