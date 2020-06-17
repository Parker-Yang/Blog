package com.cdxy.blog.mapper;

import com.cdxy.blog.entities.ArticleUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleUserMapper {
    @Select("select * from art_users")
    public List<ArticleUser> findAll();
}
