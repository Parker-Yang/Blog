package com.cdxy.blog.controller;

import com.cdxy.blog.entities.Article;
import com.cdxy.blog.entities.User;
import com.cdxy.blog.service.ArticleService;
import com.cdxy.blog.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/findArticle")
    public String findArticle(@RequestParam(value = "art_type",required = false) String art_type){
        if (art_type==null) {
            return "redirect:/article/findArticleAll";
        }else {
            return "redirect:/article/findArticleByType?art_type="+art_type;
        }
    }
    @GetMapping("/findArticleAll")
    @ResponseBody
    public List<Article> findAll(){
        return articleService.findAll();
    }
    @GetMapping("/findArticleById")
    @ResponseBody
    public Article findArticleById(@RequestParam("id") int art_id){
        return articleService.findArticleById(art_id);
    }
    @GetMapping("/findArticleByType")
    @ResponseBody
    public List<Article> findArticleByType(@RequestParam("art_type") String art_type){
        return articleService.findArticleByType(art_type);
    }

}
