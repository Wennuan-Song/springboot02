package com.offcn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Reference(timeout = 3000)
    UserService userService;

    @GetMapping("/all")
    public List<User> add(){
        return userService.getUserList();
    }
}
