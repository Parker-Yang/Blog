package com.cdxy.blog.mapper;

import com.cdxy.blog.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> findAll();
    @Select("select * from user where name=#{name}")
    public User findUserById(User user);
}
