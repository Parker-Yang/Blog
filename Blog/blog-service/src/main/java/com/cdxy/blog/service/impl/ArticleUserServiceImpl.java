package com.cdxy.blog.service.impl;

import com.cdxy.blog.entities.ArticleUser;
import com.cdxy.blog.mapper.ArticleUserMapper;
import com.cdxy.blog.service.ArticleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleUserServiceImpl implements ArticleUserService {

    @Autowired
    ArticleUserMapper articleUserMapper;

    @Override
    public List<ArticleUser> findAll() {
        return articleUserMapper.findAll();
    }
}
