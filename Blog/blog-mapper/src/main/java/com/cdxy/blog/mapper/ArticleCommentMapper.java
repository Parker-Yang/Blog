package com.cdxy.blog.mapper;

import com.cdxy.blog.entities.Article;
import com.cdxy.blog.entities.ArticleComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArticleCommentMapper {
    @Select("select * from art_comment")
    public List<ArticleComment> findAll();
}
