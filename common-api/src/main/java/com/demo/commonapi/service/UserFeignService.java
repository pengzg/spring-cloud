package com.demo.commonapi.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.commonapi.model.User;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="FEIGN-API")
public interface UserFeignService {

    @RequestMapping("/provide/user/get")
    public Object get(@RequestParam("id") String id);
}
