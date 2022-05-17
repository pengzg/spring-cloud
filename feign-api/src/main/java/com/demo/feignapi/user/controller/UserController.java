package com.demo.feignapi.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/provide/user")
public class UserController {


	
	@RequestMapping("get")
	public String get(String id) {
		System.out.println("请求进来了");
		return "这是8083服务器==》"+id;
        //return this.userService.getUser(id);
    } 
}