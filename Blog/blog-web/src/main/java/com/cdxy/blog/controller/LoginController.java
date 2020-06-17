package com.cdxy.blog.controller;

import com.cdxy.blog.entities.CommonResult;
import com.cdxy.blog.entities.User;
import com.cdxy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public CommonResult login(@RequestBody User user){
        User result = userService.findUserById(user);
        if (result!=null){
            return new CommonResult(200,"登录成功",result);
        }
        return new CommonResult(400,"登录失败");
    }
}
