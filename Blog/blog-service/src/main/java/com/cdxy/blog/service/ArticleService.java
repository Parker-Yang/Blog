package com.cdxy.blog.service;

import com.cdxy.blog.entities.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> findAll();

    Article findArticleById(int art_id);

    List<Article> findArticleByType(String art_type);
}
