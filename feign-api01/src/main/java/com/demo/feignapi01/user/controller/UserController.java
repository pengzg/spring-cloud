package com.demo.feignapi01.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/provide/user")
public class UserController {


	
	@RequestMapping("/get")
	public String get(String id) {
		return "这是8084服务器==》"+id;
        //return this.userService.getUser(id);
    } 
}