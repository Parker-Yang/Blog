package com.cdxy.blog.service;

import com.cdxy.blog.entities.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findUserById(User user);
}
