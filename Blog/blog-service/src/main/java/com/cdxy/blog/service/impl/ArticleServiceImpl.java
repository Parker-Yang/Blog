package com.cdxy.blog.service.impl;

import com.cdxy.blog.entities.Article;
import com.cdxy.blog.mapper.ArticleMapper;
import com.cdxy.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }

    @Override
    public Article findArticleById(int art_id) {
        return articleMapper.findArticleById(art_id);
    }

    @Override
    public List<Article> findArticleByType(String art_type) {
        return articleMapper.findArticleByType(art_type);
    }
}
