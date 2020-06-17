package com.cdxy.blog.service.impl;

import com.cdxy.blog.entities.User;
import com.cdxy.blog.mapper.UserMapper;
import com.cdxy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findUserById(User user) {
        return userMapper.findUserById(user);
    }
}
