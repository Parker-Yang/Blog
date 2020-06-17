package com.cdxy.blog.controller;

import com.cdxy.blog.entities.User;
import com.cdxy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/findUserAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}
