package com.cdxy.blog.mapper;

import com.cdxy.blog.entities.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface ArticleMapper {
    @Select("select * from article")
    public List<Article> findAll();
    @Select("select * from article where art_id=#{art_id}")
    Article findArticleById(int art_id);
    @Select("select * from article where art_type=#{art_type}")
    List<Article> findArticleByType(String art_type);
}
