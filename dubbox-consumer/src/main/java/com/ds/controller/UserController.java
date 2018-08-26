package com.ds.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ds.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //远程注入
    @Reference
    private UserService userService;
    @RequestMapping("getUserName")
    public String getUserName(){
        return userService.getUserName();
    }

}
