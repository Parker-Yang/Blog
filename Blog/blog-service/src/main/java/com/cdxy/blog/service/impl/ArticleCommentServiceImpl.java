package com.cdxy.blog.service.impl;

import com.cdxy.blog.entities.ArticleComment;
import com.cdxy.blog.mapper.ArticleCommentMapper;
import com.cdxy.blog.service.ArticleCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleCommentServiceImpl implements ArticleCommentService {

    @Autowired
    ArticleCommentMapper articleCommentMapper;

    @Override
    public List<ArticleComment> findAll() {
        return articleCommentMapper.findAll();
    }
}
